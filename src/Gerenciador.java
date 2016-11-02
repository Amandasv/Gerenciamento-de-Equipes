import java.io.FileNotFoundException;

public class Gerenciador {

	public static void main(String[] args) {
		
		try {
			(new Gerenciador()).run();
		} catch (FileNotFoundException e) {
			System.err.println("Nao encontrou arquivo.");
			System.err.println(e.getMessage());
		}
	}

	private void run() throws FileNotFoundException {
		verificaColaboradores();
		verificaCompetencias();
		verificaProjetos();
		verificaFuncionarios();
	}
	
	private void verificaProjetos() throws FileNotFoundException {
		Parser<Projeto> parser = new ProjetoParser();
		LeitorCSV<Projeto> leitor = new LeitorCSV<>("ArquivosCSV/projetos.csv", parser);
		leitor.skipLine();
		while (leitor.hasNext()) {
			Projeto projeto = leitor.readObject();
			System.out.println(projeto);
		}
		leitor.close();
		
	}

	private void verificaCompetencias() throws FileNotFoundException{
		Parser<Competencia> parser = new CompetenciaParser();
		LeitorCSV<Competencia> leitor = new LeitorCSV<>("ArquivosCSV/competencias.csv", parser);
		leitor.skipLine();
		while (leitor.hasNext()) {
			Competencia competencia = leitor.readObject();
			System.out.println(competencia);
		}
		leitor.close();
	}

	private void verificaColaboradores() throws FileNotFoundException {
		Parser<Colaborador> parser = new ColaboradorParser(); 
		LeitorCSV<Colaborador> leitor = new LeitorCSV<>("ArquivosCSV/colaboradores.csv", parser);
		leitor.skipLine();
		while (leitor.hasNext()) {
			Colaborador colaborador = leitor.readObject();
			System.out.println(colaborador);
		}
		leitor.close();
	}
	
	
	private void verificaFuncionarios() throws FileNotFoundException {
		Parser<Funcionario> parser = new FuncionarioParser(); 
		LeitorCSV<Funcionario> leitor = new LeitorCSV<>("ArquivosCSV/funcionarios.csv", parser);
		leitor.skipLine();
		while (leitor.hasNext()) {
			Funcionario funcionario = leitor.readObject();
			System.out.println(funcionario);
		}
		leitor.close();
	}

}
