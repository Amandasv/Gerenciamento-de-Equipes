public class Colaborador {
	private String nomeProjeto;
	private String nomeFuncionarios;
	private String competencias;
	
	
	public Colaborador(String projeto, String funcionarios, String competencias){
		this.nomeProjeto = projeto;
		this.nomeFuncionarios = funcionarios;
		this.competencias = competencias;
	}	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome Projeto: " + nomeProjeto + " | Funcionario: " + nomeFuncionarios + " | Competencia: " + competencias + ";";
	}
	
	
}
