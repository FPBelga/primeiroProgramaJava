package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notasJava = { 8.8, 9.7, 8.5, 7.8 };
		double[] notasLogica = { 9.8, 7.7, 5.5, 8.8 };
		double[] notasBiologia = { 9.0, 7.5, 7.0, 8.5 };
		double[] notasAnatomia = { 9.8, 7.9, 6.5, 9.8 };

		// Adicionando o Aluno 1
		Aluno aluno = new Aluno(); // Adicionando 1 aluno ao array de alunos
		aluno.setNome("Felipe Belga Dias");
		aluno.setNomeEscola("CURSO JDEV TREINAMENTO");

		Disciplina disciplina = new Disciplina();// adicionando a disciplina 1 a lista de disciplinas dentro do array de
													// alunos
		disciplina.setDisciplina("JAVA");
		disciplina.setNota(notasJava);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();// adicionando a disciplina 2 a lista de disciplinas dentro do array
													// de alunos
		disciplina2.setDisciplina("LOGICA");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);

		// Adicionando o aluno 2
		Aluno aluno2 = new Aluno(); // Adicionando 1 aluno ao array de alunos
		aluno2.setNome("Angela Maria Belga Dias");
		aluno2.setNomeEscola("CURSO ENFERMAGEM");

		Disciplina disciplina3 = new Disciplina();// adicionando a disciplina 1 a lista de disciplinas dentro do array
													// de alunos
		disciplina3.setDisciplina("BIOLOGIA");
		disciplina3.setNota(notasBiologia);

		aluno2.getDisciplinas().add(disciplina3);

		Disciplina disciplina4 = new Disciplina();// adicionando a disciplina 2 a lista de disciplinas dentro do array
													// de alunos
		disciplina4.setDisciplina("ANATOMIA");
		disciplina4.setNota(notasAnatomia);

		aluno2.getDisciplinas().add(disciplina4);

		Aluno[] arrayAlunos = new Aluno[2]; // Criando um Array de alunos de 1 posição

		arrayAlunos[0] = aluno; // Criando o array do aluno1
		arrayAlunos[1] = aluno2;// Criando o array do aluno2

		for (int pos = 0; pos < arrayAlunos.length; pos++) { // Varrendo o array de alunos

			System.out.println("O nome do alubo é: " + arrayAlunos[pos].getNome());// imprimindo os alunos

			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) { // varrendo a lista de disciplinas dentro do array
																		// do alunos
				System.out.println("O nome da disciplina é: " + d.getDisciplina());// imprimindo disciplinas

				for (int posN = 0; posN < d.getNota().length; posN++) { // varrendo o array de notas dentro da lista de
																		// disciplinas
					System.out.println("A nota número: " + (posN + 1) + " é igual : " + d.getNota()[posN]);
				}
			}

		}
		
		/*------------------------------------------------------------------------------------------------------------*/

		/*
		 * System.out.println("---------------Disciplina do Aluno---------------");
		 * System.out.println("Nome do aluno = " + aluno.getNome() +
		 * " inscrito no curso : " + aluno.getNomeEscola());
		 * 
		 * double notaMax = 0.0; double notaMin = 0.0;
		 * 
		 * for (Disciplina d : aluno.getDisciplinas()) { // VARRENDO A LISTA DE
		 * DISCIPLINAS
		 * 
		 * System.out.println("Disciplina : " + d.getDisciplina());
		 * System.out.println("Notas da disciplina : ");
		 * 
		 * for (int pos = 0; pos < d.getNota().length; pos++) { // VARREANDO AS NOTAS DA
		 * DISCIPLINA DENTRO DO ARRAY System.out.println("Nota : " + (pos +1) + " é = "
		 * + d.getNota()[pos]);
		 * 
		 * if (pos == 0) { notaMax = d.getNota()[pos]; //DESCOBRINDO QUAL É A MAIOR NOTA
		 * DENTRO DA VARREDURA DO ARRAY }else { if (d.getNota()[pos] > notaMax ) {
		 * notaMax = d.getNota()[pos]; } }
		 * 
		 * if (pos == 0) { notaMin = d.getNota()[pos]; }else { if (d.getNota()[pos] <
		 * notaMin ) {//DESCOBRINDO QUAL É A MENOR NOTA DENTRO DA VARREDURA DO ARRAY
		 * notaMin = d.getNota()[pos]; } } }
		 * System.out.println("A nota maxima da Disciplina " + d.getDisciplina() +
		 * " é : " + notaMax ); System.out.println("A nota menor da Disciplina " +
		 * d.getDisciplina() + " é : " + notaMin ); }
		 */

//		String[] valores = {"Felipe Belga","Curso Java","belgasystem@gmail.com","80"};
//		
//		for (int pos = 0 ; pos < valores.length ; pos++) {
//			System.out.println("Valor na posição " + (pos + 1) + " é = " + valores[pos]);
//		}
//			
//		int[] inteiros = new int[10];
//		
//		float[] floats = new float[10];
//				
//		/*Array pode ser de todos os tipos de dados e objetos também*/
//		
//		/*Array sempre deve ter a quantidade de posicoes definidas*/
//		double[] notas = new double[Integer.valueOf(JOptionPane.showInputDialog("Informa quantas notas vc precisa"))];
//		
//		/*Atribuir valores ao array*/ 
//		int posd = 0;
//		while (posd < notas.length) {
//
//			notas[posd] = Double.valueOf(JOptionPane.showInputDialog("Digite a nota " + (posd + 1)));
//			posd++;
//		}
//		
//		for (int pos = 0 ; pos < notas.length ; pos++) {
//			
//			notas[pos] = Double.valueOf(JOptionPane.showInputDialog("Digite a nota " + (pos + 1)));
//		}
//		
//		
//		for (int pos = 0 ; pos < notas.length ; pos++) {
//			System.out.println("Nota " + (pos + 1) + " é = " + notas[pos]);
//		}
//		
	}

}
