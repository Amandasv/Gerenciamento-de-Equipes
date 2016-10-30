
public class Colaborador {
	private String nome_projeto;
	private String nome_funcionario;
	private int num_competencias;
	private String[] competencias;
	
	
	public Colaborador(String projeto, String nome, int num_competencias, String competencias){
		this.nome_projeto = projeto;
		this.nome_funcionario = nome;
		this.num_competencias = num_competencias;
		this.competencias = new String[num_competencias];
	}
	
	public void setCompetencias(int num, String competencia){
		if(num < 0 || num >= competencia.length())
			throw new ArrayIndexOutOfBoundsException(num);
		this.competencias[num] = competencia;
	}
	
	
}
