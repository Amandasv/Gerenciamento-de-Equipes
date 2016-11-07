public class Funcionario {
	private String nome;
	private Double salario;
	private int numCompetencias;
	private String[] competencias;
	
	public Funcionario(String nome, Double salario, int numCompetencias){
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
	
	public String getNome(){
		return this.nome;
	}

	@Override
	public String toString() {
		String informacoes = "Nome: " + nome + " | Salario R$ " +salario + " \n"
				+ "Competencias: " + numCompetencias+ "("; 
		String competencia= "";
		for (int i=0;i<numCompetencias;i++) {
			if(i != numCompetencias-1)
				competencia = competencia + competencias[i] +", ";
			else
				competencia = competencia + competencias[i] +");";
		} 
				
		return informacoes + competencia + "\n";
	}
}




