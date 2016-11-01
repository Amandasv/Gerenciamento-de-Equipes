import java.time.LocalDate;
import java.util.Arrays;

public class Projeto {
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private int numCompetencias;
	private String[] competencias;
	
	public Projeto(String nome, LocalDate inicio, LocalDate fim, int numCompetencias){
		this.nome = nome;
		this.dataInicio = inicio;
		this.dataFim = fim;
		this.numCompetencias = numCompetencias;
		this.competencias = new String[this.numCompetencias];
		
	}
	
	public void setCompetencia(int competencia, String nomeCompetencia) {
		if(competencia < 0 || competencia >= competencias.length){
			throw new ArrayIndexOutOfBoundsException(competencia);			
		}
		competencias[competencia] = nomeCompetencia;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + " | Inicio:" + dataInicio + " | Fim: " + dataFim + 
				" | numero competencias: " + numCompetencias + " | competencias: " + Arrays.toString(competencias) + ";";
	}
}


//nome;data_inicio;data_fim;num_competencias;competencia;competencia...

/*
 
	private String[] competencia;
	
	public Projeto(String nome, LocalDate data_inicio, LocalDate data_fim,
			int num_competencias){
		this.nome = nome;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.num_competencias = num_competencias;
		this.competencia = new String[this.num_competencias];
	}
	
	public void setCompetencias(int num, String comp){
		if(num < 0 || num >= competencia.length)
			throw new ArrayIndexOutOfBoundsException(num);
		this.competencia[num] = comp;
	}
	
	@Override
	public String toString() {
		
		return "Projeto: " + this.nome + "\nInicio: " + this.data_inicio + 
				"\nFim: " + this.data_fim + "\nNúmero de competencias: " + this.num_competencias
				+ "\nCompetencias: [ "
				+ competencia + "]";
		
	}
	
}
 
 
 
 
 
------
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