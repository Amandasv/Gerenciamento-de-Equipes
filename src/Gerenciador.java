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
		
	}
	
	
	private void verificaColaboradores() throws FileNotFoundException {
		Parser<Colaborador> parser = new ColaboradorParse(); 
		LeitorCSV<Colaborador> leitor = new LeitorCSV<>("arquivosCSV/colaboradores.csv", parser);
		leitor.skipLine(); // cabecalho
		while (leitor.hasNext()) {
			Colaborador colaborador = leitor.readObject();
			System.out.println(colaborador);
		}
		leitor.close();
	}

}
