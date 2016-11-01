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

/*
 
   
   import java.util.Scanner;

public class AlunoParser implements Parser<Aluno> {
	public Aluno parse(String dados) {
		Scanner arquivo = new Scanner(dados);
		arquivo.useDelimiter(";");
		String nome = arquivo.next();
		String matricula = arquivo.next();
		int numAulas = arquivo.nextInt();
		Aluno aluno = new Aluno(nome, matricula, numAulas);
		for (int aula = 0; aula < numAulas; aula++) {
			int v = arquivo.nextInt();
			aluno.setPresenca(aula, v == 1);
		}
		arquivo.close();
		return aluno;
	}
}

   
   
 */
 