import java.io.FileNotFoundException;

public class CarregaArquivos {

	public void verificaProjetos() throws FileNotFoundException {
		Parser<Projeto> parser = new ProjetoParser();
		LeitorCSV<Projeto> leitor = new LeitorCSV<>("ArquivosCSV/projetos.csv", parser);
		leitor.skipLine();
		
		Vetor<Projeto> carregaVetorComperencia = new Vetor<>();
		
		while (leitor.hasNext()) {
			Projeto projeto = leitor.readObject();
			carregaVetorComperencia.append(projeto);
		}
		leitor.close();
		
	}

	public void verificaCompetencias() throws FileNotFoundException{
		Parser<Competencia> parser = new CompetenciaParser();
		LeitorCSV<Competencia> leitor = new LeitorCSV<>("ArquivosCSV/competencias.csv", parser);
		leitor.skipLine();
		
		Vetor<Competencia> carregaVetorComperencia = new Vetor<>();
		while (leitor.hasNext()) {
			Competencia competencia = leitor.readObject();
			carregaVetorComperencia.append(competencia);
		}
		leitor.close();
	}

	public void verificaColaboradores() throws FileNotFoundException {
		Parser<Colaborador> parser = new ColaboradorParser(); 
		LeitorCSV<Colaborador> leitor = new LeitorCSV<>("ArquivosCSV/colaboradores.csv", parser);
		leitor.skipLine();

		Vetor<Colaborador> carregaVetorColaborador = new Vetor<>();
		
		while (leitor.hasNext()) {
			Colaborador colaborador = leitor.readObject();
			carregaVetorColaborador.append(colaborador);
		}
		leitor.close();
	}
	
	
	public void verificaFuncionarios() throws FileNotFoundException {
		Parser<Funcionario> parser = new FuncionarioParser(); 
		LeitorCSV<Funcionario> leitor = new LeitorCSV<>("ArquivosCSV/funcionarios.csv", parser);
		leitor.skipLine();
		
		Vetor<Funcionario> carregaVetorFuncionario = new Vetor<>();
		while (leitor.hasNext()) {
			Funcionario funcionario = leitor.readObject();
			carregaVetorFuncionario.append(funcionario);			
		}
		System.out.println(carregaVetorFuncionario.get(4));
		
		leitor.close();
	}
	
}
