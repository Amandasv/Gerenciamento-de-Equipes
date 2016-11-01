public class Competencia {
	private String nome;
	
	public Competencia(String nomeCompetencia){
		this.nome = nomeCompetencia;
	}
	
	@Override
	public String toString() {

		return "Competencia: " + nome + ";";
	}
}

/* 

import java.util.Arrays;

public class Aluno {

	private String nome;
	private String matricula;
	private boolean[] presencas;

	public Aluno(String nome, String matricula, int numAulas) {
		this.nome = nome;
		this.matricula = matricula;
		this.presencas = new boolean[numAulas];
	}

	public void setPresenca(int aula, boolean presente) {
		if (aula < 0 || aula >= presencas.length)
			throw new ArrayIndexOutOfBoundsException(aula);
		this.presencas[aula] = presente;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", presencas=" + Arrays.toString(presencas) + "]";
	}

}


*/