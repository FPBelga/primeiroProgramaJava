package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno aluno = new Aluno();
		aluno.setNome("Felipe Belga Dias");
		aluno.setIdade(46);

		Diretor diretor = new Diretor();
		diretor.setNome("Professor Tauller");
		diretor.setIdade(60);

		Secretario secretario = new Secretario();
		secretario.setNome("Joao pé de feijão");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println("-----------------------------------------");
		System.out.println(diretor);
		System.out.println("-----------------------------------------");
		System.out.println(secretario);

		
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());  
		System.out.println(diretor.pessoaMaiorIdade());  		
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("O Salário do Aluno é = " + aluno.Salario());  
		System.out.println("O Salário do Diretor é = " + diretor.Salario());
		System.out.println("O Salário do Secretario é = " + secretario.Salario());  
	
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
		public static void teste (Pessoa pessoa) {
			System.out.println("Essa pessoa é " + pessoa.getNome() + " O salario dela é " + pessoa.Salario());
		}
	
	}
	
	
	
