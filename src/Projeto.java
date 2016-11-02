import java.time.LocalDate;

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
		String informacoes =  "Nome: " + nome + " | Inicio:" + dataInicio + " | Fim: " + dataFim + 
				" | numero competencias: " + numCompetencias + " | competencias: ";
		String competencia= "";
		for (int i=0;i<numCompetencias;i++) {
			competencia = competencia + competencias[i] +", ";
		} 
				
		return informacoes + competencia;
	}
}

