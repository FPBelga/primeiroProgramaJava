package cursojava.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota (String erro) {
		super("Opa deu erro para processar as notas");
	}
}
