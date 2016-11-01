import java.util.Scanner;

public class ColaboradorParser implements Parser<Colaborador> {

	public Colaborador parse(String dados) {
		Scanner arquivo = new Scanner(dados);
		arquivo.useDelimiter(";");
		String nomeProjeto = arquivo.next();
	
		String nomeFuncionarios = arquivo.next();	
		String competencias = arquivo.next();				
		Colaborador colaborador = new Colaborador(nomeProjeto, nomeFuncionarios, competencias);
		
		arquivo.close();
		return colaborador;
		
		
	}

}
