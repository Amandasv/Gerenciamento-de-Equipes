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
	
//	public void testaUm(){
//		for (Funcionario funcionario : Funcionario) {
//			
//		}
//	}
//	
	@Override
	public String toString() {
		String informacoes = "Nome: " + nome + " | Salario " +salario + " | numero competencias: " + numCompetencias+ " | competencias: "; 
		String competencia= "";
		for (int i=0;i<numCompetencias;i++) {
			competencia = competencia + competencias[i] +", ";
		} 
				
		return informacoes + competencia;
	}
}




