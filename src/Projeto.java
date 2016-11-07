import java.time.LocalDate;
import java.util.Scanner;

public class Projeto {
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private int numCompetencias;
	private String[] competencias;
	
	Scanner leitorTeclado = new Scanner(System.in);
	
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
	
	public void addCompetencia(){
		for (int i = 0; i < competencias.length; i++) {
			System.out.println("Nome da competencia [" + (i+1)+"]: ");
			if(i < competencias.length)
				competencias[i] = leitorTeclado.next();		
		}
	}
	
	public String getNome(){
		return this.nome;
	}
	
	@Override
	public String toString() {
		String informacoes =  "Nome: " + nome + " | Inicio: " + dataInicio + " | Fim: " + dataFim + 
				"\nCompetencias: " + numCompetencias + "(";
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



