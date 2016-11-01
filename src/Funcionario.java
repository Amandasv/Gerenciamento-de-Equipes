import java.util.Arrays;

public class Funcionario {
	private String nome;
	private String salario; // Ajustar para double
	private int numCompetencias;
	private String[] competencias;
	
	public Funcionario(String nome, String salario, int numCompetencias){
		this.nome = nome;
		this.salario = salario;
		this.numCompetencias = numCompetencias;
		this.competencias = new String[numCompetencias];
	}
	
	public void setCompetencia(int competencia, String nomeCompetencia) {
		if(competencia < 0 || competencia >= competencias.length){
			throw new ArrayIndexOutOfBoundsException(competencia);			
		}
		competencias[competencia] = nomeCompetencia;		
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + " | Salario " +salario + " | numero competencias: " + numCompetencias+ " | competencias: " 
				+ Arrays.toString(competencias) +" ;";
	}
}

