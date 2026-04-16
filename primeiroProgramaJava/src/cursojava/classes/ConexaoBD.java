package cursojava.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

	private static Connection conexao = null;
	
	public static Connection conectar() {
      
		try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Autocom3_LOG";
            String usuario = "user=sa";
            String senha = "password=call1234";
            conexao = DriverManager.getConnection(url, usuario, senha + ";encrypt=false");
            return conexao;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao conectar ao banco de dados.");
        }
    }
	
	 public static void desconectar() {
	        if (conexao != null) {
	            try {
	                conexao.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	 }
	
	
}