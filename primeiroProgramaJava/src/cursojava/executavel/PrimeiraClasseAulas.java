package cursojava.executavel;

public @interface PrimeiraClasseAulas {

	

//			int nota1 = 70;
//			int nota2 = 70;
//			int nota3 = 70;
//			int nota4 = 60;
//			int media = 0;
	//
//			media = (nota1 + nota2 + nota3 + nota4) / 4;

//			/*Condiçoes logicas IF e ELSE*/
//			if (media >= 70) {
//				System.out.println("Parabéns vc foi Aprovado: " + media);
//			} else if (media >= 40 && media <= 69) {
//				System.out.println("Aluno em Recuperação: " + media);
//			} else {
//				System.out.println("Aluno Reprovado");
//			}

			/* Operadores Ternários são pra micros validacoes */

//			String saidaResultado = media >=70 ? "Aluno aprovadpo" :(media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Aluno Reprovado"  ;
//			
//			System.out.println(saidaResultado);

			/* Operadores aninhadas são operações dentro de operações */

//			if (media >= 50) {
//				if (media >= 70) {
//					if (media >= 90) {
//						System.out.println("Aluno Aprovado direto - Parabéns " + media);
//					} else {
//						System.out.println("Aluno Aprovado direto " + media);
//					} 
//				} else {
//					System.out.println("Aluno em recuperação " + media);
//				}
//			}else {
//				System.out.println("Aluno Reprovado direto " + media);
//			}

			/* SWITCH CASE - OPERAÇOES EXATAS */

//			int dia = 2;
//			switch (dia) {
//			case 1: {
//				System.out.println("Domingo");
//				break;
//			}
//			case 2: {
//				System.out.println("Segunda-Feira");
//				break;
//			}
//			case 3: {
//				System.out.println("Terça-Feira");
//				break;
//			}
//			case 4: {
//				System.out.println("Quarta-Feira");
//				break;
//			}
//			case 5: {
//				System.out.println("Quinta-Feira");
//				break;
//			}
//			case 6: {
//				System.out.println("Sexta-Feira");
//				break;
//			}
//			case 7: {
//				System.out.println("Sábado");
//				break;
//			}
//			default: System.out.println("Não encontrado");
//				break;
//			}

			/*
			 * Operadores Relacionais - == igual / != diferente / < Menor / > Maior / <=
			 * Menor igual / >= Maior igual
			 */

//			if (nota1 != nota2) {
//				System.out.println("Notas não são iguais");
//			}else {
//			    System.out.println("Notas não são diferentes");
//			}

			/*
			 * Estrutura de repetição WHILE e DO WHILE - Repete equanto a CONDICAO for
			 * VERDADEIRA
			 */

//			int numero = 0;
//			
//			while (numero <= 10) { /* Primeiro Verifica e depois executa */
//				System.out.println("O numero é " + numero);
//				numero ++;	}
//			
//	       
//			int numero2 = 0;
//				
//	        do {/* Primeiro executa e depois verifica */
//	        	System.out.println("O numero2 é " + numero2);
//	        	numero2 ++;
//	        	
//	        }while (numero2 <= 60) ;

			/* Estrutura de repetição FOR - */

//			for (int numero = 10; numero >= 0; numero--)
//				System.out.println("O numero é " + numero);
	//
//			for (int numero2 = 0; numero2 <= 10; numero2++)
//				System.out.println("O numero2 é " + numero2);

			/* Estrutura de repetição FOR com Break (parada */

//			for (int numero = 0; numero <= 10; numero++) {
//				
//				if (numero == 7) {
//					System.out.println("Oba encontrei o número  " + numero);
//					System.out.println("Estou parando por aqui");
//					break;
//				}
//			}

			/* Estrutura de repetição FOR com CONTINUE */

//			for (int numero = 0; numero <= 10; numero++) {
//				
//				if (numero == 7 || numero == 10 || numero == 5) {
//					System.out.println("Oba encontrei o número  " + numero);
//					continue;
//				}
//			}

			/* Divisões e resto com MOD do Java */

//			double carro = 9;
//			double pessoa = 2;
//			
//			double resto = carro % pessoa;
//			
//			System.out.println("Sobraram exatamente  " + resto + " carros");

			/* Criando entrada de dados */

//			String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
//			String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
//			
//			double carroNumero = Double.parseDouble(carros);
//			double pessoaNumero = Double.parseDouble(pessoas);
//			
//			
//			int divisao = (int) (carroNumero / pessoaNumero);
//			
//			double resto = carroNumero % pessoaNumero;
//			
//			JOptionPane.showMessageDialog(null, "Divisão por " + pessoas + " pessoas deu " + divisao + " carros por pessoa e sobrou "+ resto + " carros");

			/* Criando uma opção de confirmação */

//			String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
//			String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
//			
//			double carroNumero = Double.parseDouble(carros);
//			double pessoaNumero = Double.parseDouble(pessoas);
//			
//			
//			int divisao = (int) (carroNumero / pessoaNumero);
//			
//			double resto = carroNumero % pessoaNumero;
//			
//		    int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão");
//			
//		    if (resposta == 0) {
//			JOptionPane.showMessageDialog(null, "Divisão por " + pessoas + " pessoas deu " + divisao + " carros por pessoa e sobrou "+ resto + " carros");
//		    }
//		    
//		    resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão");
//			
//		    if (resposta == 0) {
//				JOptionPane.showMessageDialog(null, "O resto da divisão é  "+ resto);
//			}else {
//				System.out.println("Não quis ver o resultado");
//			}

			/* Criando um programa de calculo de média */

//			String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
//			String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
//			String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
//			String nota4 = JOptionPane.showInputDialog("Informe a nota 4");
	//
//			double dnota1 = Double.parseDouble(nota1);
//			double dnota2 = Double.parseDouble(nota2);
//			double dnota3 = Double.parseDouble(nota3);
//			double dnota4 = Double.parseDouble(nota4);
	//
//			double media = (dnota1 + dnota2 + dnota3 + dnota4) / 4;
	//
//			if (media >= 50) {
	//
//				if (media >= 70) {
//					JOptionPane.showMessageDialog(null, "Sua média é  " + media + " APROVADO");
//				} else {
//					JOptionPane.showMessageDialog(null, "Sua média é  " + media + " REUPERAÇÂO");
//				}
	//
//			} else {
//				JOptionPane.showMessageDialog(null, "A média é  " + media + " REPROVADO");
	//
//			}
//		}
//	}

//	aluno1.getDisciplina().setDisciplina1(JOptionPane.showInputDialog("Informe o nome da Disciplina 1"));
//	aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno")));
//	aluno1.getDisciplina().setDisciplina2(JOptionPane.showInputDialog("Informe o nome da Disciplina 1"));
//	aluno1.getDisciplina().setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno")));
//	aluno1.getDisciplina().setDisciplina3(JOptionPane.showInputDialog("Informe o nome da Disciplina 1"));
//	aluno1.getDisciplina().setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno")));

//	aluno1.setDisciplina2(JOptionPane.showInputDialog("Informe o nome da Disciplina 2"));
//	aluno1.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno")));
//
//	aluno1.setDisciplina3(JOptionPane.showInputDialog("Informe o nome da Disciplina 3"));
//	aluno1.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 do aluno")));
//
//	aluno1.setDisciplina4(JOptionPane.showInputDialog("Informe o nome da Disciplina 4"));
//	aluno1.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4 do aluno")));

	/*
	 * System.out.println("nome do aluno é " + aluno1.getNome());
	 * System.out.println("IDADE do aluno é " + aluno1.getIdade());
	 * System.out.println("Data de nascimento do aluno é " +
	 * aluno1.getDataNascimento()); System.out.println("Identidade aluno é " +
	 * aluno1.getRegistroGeral()); System.out.println("CPF do aluno é " +
	 * aluno1.getNumeroCpf()); //System.out.println("A média do aluno é " +);
	 * 
	 * //JOptionPane.showMessageDialog(null, "A média é  " + aluno1.getMediaNota() +
	 * (aluno1.ge6tAlunoAprovado() ? " Aprovado" : " Reprovado"));
	 * 
	 * JOptionPane.showMessageDialog(null, "A média é  " + aluno1.getMediaNota() +
	 * aluno1.getAlunoAprovado2());
	 * 
	 * Aluno aluno2 = new Aluno();//Aqui será o Pedro
	 * 
	 * Aluno aluno3 = new Aluno();//Aqui será o Alex
	 * 
	 * Aluno aluno4 = new Aluno("Maria");
	 * 
	 * Aluno aluno5 = new Aluno("Jose", 50);
	 */
//
//	System.out.println(aluno1.toString());
//	System.out.println("A média é  " + aluno1.getMediaNota() + aluno1.getAlunoAprovado2());

//	Aluno aluno1 = new Aluno();
//	aluno1.setNome("A");
//	
//	Aluno aluno2 = new Aluno();
//	aluno2.setNome("A");
//	
//	if (aluno1.equals(aluno2)) {
//		System.out.println("Alunos são Iguais");
//	}else {
//		System.out.println("Alunos são Diferentes");
//	}
	
}
