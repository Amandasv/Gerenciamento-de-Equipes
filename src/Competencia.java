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
