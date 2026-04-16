package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* Main e um metodo auto executavel em java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<>(); // new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <= 1; qtd++) {
		
	    Aluno aluno1 = new Aluno();// Aqui será João
		
//		String nome = JOptionPane.showInputDialog("Nome do Aluno ?");
//		String idade = JOptionPane.showInputDialog("Idade do Aluno ?");
//		String dataNascimento = JOptionPane.showInputDialog("Informe o nome do Aluno ?");
//		String rg = JOptionPane.showInputDialog("Identidade do Aluno ?");
//	    String cpf = JOptionPane.showInputDialog("CPF do Aluno ?");	
//		String mae = JOptionPane.showInputDialog(" nome da mae do Aluno ?");
//		String pai = JOptionPane.showInputDialog("nome do pai do Aluno ?");
//		String matricula = JOptionPane.showInputDialog("MAtricula do Aluno ?");
//		String serie = JOptionPane.showInputDialog("Serie do Aluno ?");
//		String escola = JOptionPane.showInputDialog("IESCOLA do Aluno ?");
		
		
		
	    aluno1.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno " + qtd + " ?"));
		String idade = JOptionPane.showInputDialog("Informe a idade do Aluno " + qtd + "?");
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento("08/07/1977");
		aluno1.setRegistroGeral("125.517.652");
		aluno1.setNumeroCpf("075.129.517-52");
		aluno1.setNomeMae("Clemildes Belga Dias");
		aluno1.setNomePai("Gerson Dias");
		aluno1.setDataMatricula("20/09/2023");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("JDEV Treinamentos");
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane
					.showInputDialog("Informe o nome da Disciplina" + pos + " ?");
			String notaDisciplina = JOptionPane
					.showInputDialog("Informe a nota " + pos + " ?");

			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno1.getDisciplinas().add(disciplina);
		}
		
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
		
			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane
							.showInputDialog("Qual disciplina quer remover 1, 2, 3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					System.out.println("A disciplina removida foi" + disciplinaRemover);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");

			  }
			}
			
			alunos.add(aluno1);
		}
		
		for (Aluno aluno1 : alunos) {
			
			System.out.println("Aluno = " + aluno1.getNome());
			System.out.println("Aluno = " + aluno1.getIdade());
			System.out.println("Aluno = " + aluno1.getDataNascimento());
			System.out.println("Aluno = " + aluno1.getRegistroGeral());
			System.out.println("Aluno = " + aluno1.getNumeroCpf());
			System.out.println("Aluno = " + aluno1.getNomeMae());
			System.out.println("Aluno = " + aluno1.getNomePai());
			System.out.println("Aluno = " + aluno1.getDataMatricula());
			System.out.println("Aluno = " + aluno1.getSerieMatriculado());
			System.out.println("Aluno = " + aluno1.getNomeEscola());
	    	System.out.println("Media do Aluno = " + aluno1.getMediaNota());
	    	System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
	    	System.out.println("-----------------------------------------------------------------------------------");
		}
	}
}

/*---------------------------------------------------------------------------------------------------------------*\		
		
//		try {
//
//			lerArquivo();
//
//			/* Sobre o construtor do objeto */
//			/* new Aluno() é uma instância ou criação de objeto */
//			/* aluno1 é uma referencia ao objeto Aluno. ou seja, uma variável */
//			String Login = JOptionPane.showInputDialog("Informe o Login");
//			String Senha = JOptionPane.showInputDialog("Informe a Senha");
//
//			// FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
//
//			// PermitirAcesso permitirAcesso = new Secretario(Login, Senha);
//
//			if (new FuncaoAutenticacao(new Diretor(Login, Senha)).autenticar()) {
//
//				List<Aluno> alunos = new ArrayList<>(); // new ArrayList<Aluno>();
//
//				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
//
////		List<Aluno> alunosAprovado = new ArrayList<Aluno>();
////		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
////		List<Aluno> alunosReprovado = new ArrayList<Aluno>();
//
//				for (int qtd = 1; qtd <= 1; qtd++) {
//
//					Aluno aluno1 = new Aluno();// Aqui será João
//					
//
//					aluno1.setNome(JOptionPane.showInputDialog("Informe o nome do Aluno " + qtd + " ?"));
//					String idade = JOptionPane.showInputDialog("Informe a idade do Aluno " + qtd + "?");
//					aluno1.setIdade(Integer.valueOf(idade));
//					// aluno1.setDataNascimento("08/07/1977");
//					// aluno1.setRegistroGeral("125.517.652");
//					// aluno1.setNumeroCpf("075.129.517-52");
//					// aluno1.setNomeMae("Clemildes Belga Dias");
//					// aluno1.setNomePai("Gerson Dias");
//					// aluno1.setDataMatricula("20/09/2023");
//					// aluno1.setSerieMatriculado("5");
//					// aluno1.setNomeEscola("JDEV Treinamentos");
//
//					for (int pos = 1; pos <= 1; pos++) {
//						String nomeDisciplina = JOptionPane
//								.showInputDialog("Informe o nome da Disciplina" + pos + " ?");
//						String notaDisciplina = JOptionPane.showInputDialog("Informe a nota " + pos + " ?");
//
//						Disciplina disciplina = new Disciplina();
//						disciplina.setDisciplina(nomeDisciplina);
//			//			disciplina.setNota(Double.valueOf(notaDisciplina));
//
//						aluno1.getDisciplinas().add(disciplina);
//					}
//
////			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
//
////			if (escolha == 0) {
////
////				int continuarRemover = 0;
////				int posicao = 1;
////				while (continuarRemover == 0) {
////					String disciplinaRemover = JOptionPane
////							.showInputDialog("Qual disciplina quer remover 1, 2, 3 ou 4 ?");
////					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
////					System.out.println("A disciplina removida foi" + disciplinaRemover);
////					posicao++;
////					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
////
////				}
////			}
//
//					alunos.add(aluno1);
//
//					maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
//					maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
//					maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
//
//				}
////
//				for (Aluno aluno : alunos) { /* Separado em Listas */
//
//					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
//
//						maps.get(StatusAluno.APROVADO).add(aluno);
//					} else
//
//					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
//
//						maps.get(StatusAluno.RECUPERACAO).add(aluno);
//					} else
//
//					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
//
//						maps.get(StatusAluno.REPROVADO).add(aluno);
//
//					}
//				}
//
//				System.out.println("----------------Lista dos Aprovados-------------");
//				for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
//					System.out.println(" Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
//							+ " com média de = " + aluno.getMediaNota());
//				}
//
//				System.out.println("----------------Lista dos Recuperação-------------");
//				for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
//					System.out.println(" Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
//							+ " com média de = " + aluno.getMediaNota());
//				}
//
//				System.out.println("----------------Lista dos Reprovados-------------");
//				for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
//					System.out.println(" Nome = " + aluno.getNome() + " Resultado = " + aluno.getAlunoAprovado2()
//							+ " com média de = " + aluno.getMediaNota());
//				}
//
////			for (int pos = 0; pos < alunos.size(); pos++) {
////
////			Aluno aluno = alunos.get(pos);
////
////			if (aluno.getNome().equalsIgnoreCase("Felipe")) {
////
////				Aluno trocar = new Aluno();
////				trocar.setNome("Aluno foi trocado");
////
////				Disciplina disciplina = new Disciplina();
////				disciplina.setDisciplina("Matemática");
////				disciplina.setNota(96);
////
////				trocar.getDisciplinas().add(disciplina);
////
////				alunos.set(pos, trocar);
////				aluno = alunos.get(pos);
////
////			}
////
////			System.out.println("Aluno = " + aluno.getNome());
////			System.out.println("Media do Aluno = " + aluno.getMediaNota());
////			System.out.println("Resultado = " + aluno.getAlunoAprovado2());
////			System.out.println("-----------------------------------------------------------------------------------");
////
////			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
////
////				Disciplina disc = aluno.getDisciplinas().get(pos);
////				System.out.println("Materia = " + disc.getDisciplina() + "Nota = " + disc.getNota());
////
////			}
////
////		}
//			} else {
//				JOptionPane.showMessageDialog(null, "Acesso não permitido");
//			}
//		} catch (NumberFormatException e) {
//			e.printStackTrace(); // Imprime o ERRO na console
//
//			StringBuilder saida = new StringBuilder();
//
//			for (int pos = 0; pos < e.getStackTrace().length; pos++) {
//
//				saida.append("\n Classe de erro " + e.getStackTrace()[pos].getClassName());
//				saida.append("\n Metodo do erro " + e.getStackTrace()[pos].getMethodName());
//				saida.append("\n Linha de erro " + e.getStackTrace()[pos].getLineNumber());
//				saida.append("\n CLASS" + e.getStackTrace()[pos].getClass().getName());
//
//			}
//
//			JOptionPane.showInternalMessageDialog(null, "Erro ao processar " + saida.toString());
//
//		} catch (NullPointerException e) {
//			JOptionPane.showInternalMessageDialog(null, "Opa um null point exception" + e.getClass());
//		} catch (Exception e) {
//			e.printStackTrace();
//			JOptionPane.showInternalMessageDialog(null, "Erro inesperado - " + e.getClass().getName());
//		} finally { // Sempre é executado ocorrendo erro ou não.
//					// Porque Finally sempre é usado quando precisa executar um processo acontecendo
//					// erro ou não no sistema.
//			JOptionPane.showInternalMessageDialog(null, "Obrigado por aprender JAVA comigo ");
//		}
//
//	}
//
//	public static void lerArquivo() throws FileNotFoundException {
//
//		File fil = new File("D://arquivo.txt");
//		Scanner scanner = new Scanner(fil);

