import java.time.LocalDate;
import java.util.Scanner;

public class ProjetoParse implements Parser<Projeto> {
	public Projeto parse(String dados) {
		Scanner arquivo = new Scanner(dados);
		arquivo.useDelimiter(";");
		String nome = arquivo.next();
		LocalDate dataInicio = LocalDate.parse(arquivo.next());
		LocalDate dataFim = LocalDate.parse(arquivo.next());
		int numCompetencias = arquivo.nextInt();
		
		Projeto projeto = new Projeto(nome, dataInicio, dataFim, numCompetencias);
		for (int competencia = 0; competencia < numCompetencias; competencia++) {
			String nomeCompetencia = arquivo.next();
			projeto.setCompetencia(competencia, nomeCompetencia);
		}
				
		return projeto;
	}

}



//nome;data_inicio;data_fim;num_competencias;competencia;competencia...

/* 

LocalDate.parse(arquivo.next());

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