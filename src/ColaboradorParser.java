import java.util.Scanner;

public class ColaboradorParser implements Parser<Colaborador> {

	public Colaborador parse(String dados) {
		Scanner arquivo = new Scanner(dados);
		arquivo.useDelimiter(";");
		String nomeProjeto = arquivo.next();
	
		String nomeFuncionarios = arquivo.next();
		
//		for (int i = 0; i < 10; i++) {
//			String nome = arquivo.next();
//			nomeFuncionarios[i] = nome;
//		}
//		
		String competencias = arquivo.next();
//		String[] competencias = new String[10];
//		for (int i = 0; i < 10; i++) {
//			String competencia = arquivo.next();
//			competencias[i] = competencia;
//		}
				
		Colaborador colaborador = new Colaborador(nomeProjeto, nomeFuncionarios, competencias);
		
		arquivo.close();
		return colaborador;
		
		
	}

}

//Colaborador(String projeto, String[] funcionarios, String[] competencias)

//nome_projeto;nome_funcionario;competencia

//public Aluno parse(String dados) {
//	Scanner arquivo = new Scanner(dados);
//	arquivo.useDelimiter(";");
//	String nome = arquivo.next();
//	String matricula = arquivo.next();
//	int numAulas = arquivo.nextInt();
//	Aluno aluno = new Aluno(nome, matricula, numAulas);
//	for (int aula = 0; aula < numAulas; aula++) {
//		int v = arquivo.nextInt();
//		aluno.setPresenca(aula, v == 1);
//	}
//	arquivo.close();
//	return aluno;
//}