package cursojava.Thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("Fila rodando");

		while (true) {

			synchronized (pilha_fila) { /* Bloquear o acesso a lista por outros processos */

				Iterator interacao = pilha_fila.iterator();

				while (interacao.hasNext()) {/* Enquanto conter dados na lista vai processar o WHILE */

					ObjetoFilaThread processar = (ObjetoFilaThread) interacao.next();/* Pega o objeto atual */

					/* Processar 10 mil notas */

					/* Gerar lista em PDF */

					/* Gerar envio de email */

					System.out.println("--------------------------------------------------");

					System.out.println("E-Mail = " + processar.getEmail());
					System.out.println("Nome = " + processar.getNome());

					interacao.remove();/* remove o objeto ja processado */

					try {
						Thread.sleep(1000);/* Serve para dar um tempo de descarga de memória */
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

			try {
				Thread.sleep(1000);/* ´processou toda a lista. Dar um para limpeza de memória */
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
