package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Felipe belga Dias");
		pessoa1.setEmail("belgasystem@gmail.com");
		pessoa1.setIdade(40);
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setNome("Felipe belga Dias");
		pessoa2.setEmail("belgasystem@gmail.com");
		pessoa2.setIdade(40);
		
		Pessoa pessoa3= new Pessoa();
		
		pessoa3.setNome("Felipe belga Dias");
		pessoa3.setEmail("belgasystem@gmail.com");
		pessoa3.setIdade(40);
		
		//pode vir de um banco de dados ou de qualquer outra fonte
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		File arquivo = // criando o arquivo
				  new File("C:\\Users\\Autocom3\\git\\primeiro-programa-java-novo\\src\\cursojava\\arquivos\\arquivo.csv");
		
		if (!arquivo.exists()) {//se o arquivo não existir
			arquivo.createNewFile();//criar o arquivo caso não exista
			
		} 
		
		FileWriter escrever = new FileWriter(arquivo);
		
		for (Pessoa p : pessoas) {//gravando no arquivo a lista de pessoas que recebeu os objetos

			escrever.write( p.getNome() +";" + p.getEmail() +";" + p.getIdade() + "\n" );
		}
		
//		for (int i = 0; i<= 10 ; i++) {
//			
//			escrever.write("Texto da linha " + i +"\n");
//		
//		}
		
		escrever.flush();
		escrever.close();
	}

}
