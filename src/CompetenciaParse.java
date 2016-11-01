import java.util.Scanner;

public class CompetenciaParse implements Parser<Competencia> {
	public Competencia parse(String dados) {
		Scanner arquivo = new Scanner(dados);		
		String nome = arquivo.nextLine();
		
		Competencia competencia = new Competencia(nome);
		
		arquivo.close();		
		return competencia;
	}

}
 