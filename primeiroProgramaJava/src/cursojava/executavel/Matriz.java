package cursojava.executavel;

public class Matriz {

	public static void main(String[] args) {

		int notas[][] = new int[4][4];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		notas[0][3] = 75;

		notas[1][0] = 88;
		notas[1][1] = 95;
		notas[1][2] = 65;
		notas[1][3] = 75;
		
		notas[2][0] = 88;
		notas[2][1] = 95;
		notas[2][2] = 65;
		notas[2][3] = 75;
		
		notas[3][0] = 88;
		notas[3][1] = 95;
		notas[3][2] = 65;
		notas[3][3] = 75;
		
//		System.out.println("A nota do primeiro bimestre são: " + notas);
		
		/*Pecorre as linhas da matriz*/
		for (int poslinha = 0 ; poslinha < notas.length ; poslinha ++) {
			System.err.println("===================Linha Nº " + poslinha + "===================================");
			
			/*Para cada linha Pecorre as colunas ARRAY*/
			for (int poscoluna = 0 ; poscoluna < notas[poslinha].length ; poscoluna ++) {
				System.out.println("Valor da matriz é: " + notas[poslinha][poscoluna]);
			}
		}

	}

}
