public class Competencia {
	private String nome;
	
	public Competencia(String nomeCompetencia){
		this.nome = nomeCompetencia;
	}
	
	public String getNomeCompetencia(){
		return this.nome;
	}
	
	@Override
	public String toString() {

		return "Competencia: " + nome + ";";
	}
}
