import java.util.Scanner;

public class FuncionarioParser implements Parser<Funcionario>{
	public Funcionario parse(String dados) {
		Scanner arquivo = new Scanner(dados);
		arquivo.useDelimiter(";");
		
		String nome = arquivo.next();
		double salario = Double.parseDouble(arquivo.next());
		int numCompetencias = arquivo.nextInt();		
		
		Funcionario funcionario = new Funcionario(nome, salario, numCompetencias);		
		
		for (int competencia = 0; competencia < numCompetencias; competencia++) {
			String nomeCompetencia = arquivo.next();
			funcionario.setCompetencia(competencia, nomeCompetencia);
		}			
		
		arquivo.close();
		return funcionario;
	}
}