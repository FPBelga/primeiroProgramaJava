package cursojava.Thread;

import javax.swing.JOptionPane;

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		/* Thread processando em paralelo */
		new Thread(thread1);
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		/* ======================================== */

		/* Thread processando em paralelo */
		new Thread(thread1);
		Thread threadEnviaNota = new Thread(thread2);
		threadEnviaNota.start();

		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Abrindo a tela do sistema em segundo plano enquanto a Thread ta rodando");
		/* Fluxo do sistema, cadastrode venda, emissao de nota, algo do tipo */
		JOptionPane.showMessageDialog(null, "Sistema sendo executado");
	}

	/* construindo as THREADS em métodos para chamar quando quiser */
	public static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			/* código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * Quero executar esse envio de email com um tempo de parada ou com um tempo
				 * determinado
				 */
				System.out.println("Enviando email a cada 1 segundo");

				try {
					Thread.sleep(1000);/* Coloca o tempo determinado desejado. 1000 = 1 segundo */
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			/* Fim do código em paralelo */

		}
	};

	public static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			/* código da rotina que eu quero executar em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * Quero executar esse envio de email com um tempo de parada ou com um tempo
				 * determinado
				 */
				System.out.println("Enviando a nota fiscal para o sefaz");

				try {
					Thread.sleep(2000);/* Coloca o tempo determinado desejado. 1000 = 1 segundo */
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
			/* Fim do código em paralelo */

		}
	};
}