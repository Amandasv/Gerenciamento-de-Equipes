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

		CarregaArquivos arquivos = new CarregaArquivos();
		arquivos.verificaFuncionarios();
		arquivos.verificaColaboradores();
		arquivos.verificaCompetencias();
		arquivos.verificaProjetos();
		
	}

	

}
