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
		
	}

	
//	Parser<Aluno> parser = new AlunoParser(); 
//	CSVReader<Aluno> reader = new CSVReader<>("alunos.csv", parser);
//	while (reader.hasNext()) {
//		Aluno aluno = reader.readObject();
//		System.out.println(aluno);
//	}
//	reader.close();	
	
	
	private void verificaCompetencias() throws FileNotFoundException{
		Parser<Competencia> parser = new CompetenciaParse();
		LeitorCSV<Competencia> leitor = new LeitorCSV<>("ArquivosCSV/competencias.csv", parser);
		leitor.skipLine();
		while (leitor.hasNext()) {
			Competencia competencia = leitor.readObject();
			System.out.println(competencia);
		}
		leitor.close();
	}

	private void verificaColaboradores() throws FileNotFoundException {
		Parser<Colaborador> parser = new ColaboradorParse(); 
		LeitorCSV<Colaborador> leitor = new LeitorCSV<>("ArquivosCSV/colaboradores.csv", parser);
		leitor.skipLine(); // cabecalho
		while (leitor.hasNext()) {
			Colaborador colaborador = leitor.readObject();
			System.out.println(colaborador);
		}
		leitor.close();
	}
	
	

}
