package cursojava.executavel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cursojava.classes.ConexaoBD;

public class SistemaDeArquivos {

    public static void main(String[] args) {
        Connection conexao = ConexaoBD.conectar();

        if (conexao != null) {
            String diretorioDestino = "C:/XML"; // Defina o diretório de destino desejado

            String sql = "SELECT arquivo FROM repositorio_de_xml";
            try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    InputStream arquivo = rs.getBinaryStream("arquivo");
                    String nomeArquivo = "arquivo.xml"; // Defina o nome do arquivo como desejar

                    salvarArquivo(arquivo, diretorioDestino, nomeArquivo);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            ConexaoBD.desconectar();
        }
    }

    private static void salvarArquivo(InputStream arquivo, String diretorioDestino, String nomeArquivo) {
        try {
            byte[] buffer = new byte[arquivo.available()];
            arquivo.read(buffer);

            File destino = new File(diretorioDestino, nomeArquivo);
            try (FileOutputStream fos = new FileOutputStream(destino)) {
                fos.write(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
