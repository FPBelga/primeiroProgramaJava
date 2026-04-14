package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
	
	/*Cada disciplina terá 4 notas o ano todo*/
	public double[] nota = new double[4];
	private String disciplina;

	

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nota=");
		builder.append(nota);
		builder.append(", disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}

	
	/**
	 * @return the disciplina
	 */
	public String getDisciplina() {
		return disciplina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(nota);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(nota, other.nota);
	}

	/**
	 * @param disciplina the disciplina to set
	 */
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for (int pos = 0 ; pos < nota.length ; pos ++) {
			
			somaTotal += nota[pos];
		}
		
		return somaTotal / nota.length;
	}

}