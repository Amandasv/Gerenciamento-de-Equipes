import java.time.LocalDate;
import java.util.Scanner;

public class Cadastros {
	
	Projeto projetoObjeto = null;
	Competencia competenciaObejto = null;
	Colaborador colaboradorObejto = null;
	Funcionario funcionarioObjeto = null;
	
	Scanner leitorTeclado = new Scanner(System.in);
	
	public void cadastraProjeto(Vetor<Competencia> competenciaVetor, Vetor<Projeto> projetoVetor ){
		System.out.println("\nNovo Projeto\n");
		
		System.out.println("Nome do projeto:");
		String nome = leitorTeclado.nextLine();
		
		System.out.println("Data de inicio [AAAA-MM-DD]:");		
		LocalDate inicio = LocalDate.parse(leitorTeclado.next());
		
		System.out.println("Data final [AAAA-MM-DD]:");		
		LocalDate fim = LocalDate.parse(leitorTeclado.next());
		
		System.out.println("Numero de competencias");
		int numCompetencias = leitorTeclado.nextInt();
		
		Projeto projeto = new Projeto(nome, inicio, fim, numCompetencias);
		System.out.println("\nDigite o indice da competencia desejada:\n");
		competenciaVetor.getVetor();
		
		for (int i = 0; i < numCompetencias; i++) {
			System.out.println("\nCompetencia [" + (i+1) + "]:");
			int escolhido = leitorTeclado.nextInt();				
			String nomeCompetencia = competenciaVetor.get(escolhido).getNomeCompetencia();
			System.out.println("\nCompetencia [" + (i+1) + "]: "+nomeCompetencia);
			projeto.setCompetencia(i, nomeCompetencia);
		}	
		
		projetoVetor.append(projeto);
		System.out.println("Projeto cadastrado com sucesso");
	}
	
	public void cadastraFuncionario(Vetor<Competencia> competenciaVetor, Vetor<Funcionario> funcionarioVetor){
		System.out.println("\nNovo Funcionario\n");
		
		System.out.println("Nome completo:");
		String nome = leitorTeclado.nextLine();
		
		System.out.println("Salario:");
		Double salario = leitorTeclado.nextDouble();
		
		System.out.println("Numero de competencias");
		int numCompetencias = leitorTeclado.nextInt();
		
		Funcionario funcionario = new Funcionario(nome, salario, numCompetencias);	
		
		System.out.println("Digite o indice da competencia desejada:");
		competenciaVetor.getVetor();
		
		for (int i = 0; i < numCompetencias; i++) {
			System.out.println("Competencia [" + (i+1) + "]:");
			int escolhido = leitorTeclado.nextInt();				
			String nomeCompetencia = competenciaVetor.get(escolhido).getNomeCompetencia();
			System.out.println("Competencia [" + (i+1) + "]: "+nomeCompetencia);
			funcionario.setCompetencia(i, nomeCompetencia);
		}		
		
		funcionarioVetor.append(funcionario);
		System.out.println("Funcionário cadastrado com sucesso!!");		
	}
	
	public void cadastraCompetencias(Vetor<Competencia> competenciaVetor){
		System.out.println("\nCompetencias atuais:\n");
		competenciaVetor.getVetor();
		
		System.out.println("\nNome da nova competencia: ");
		String nome = leitorTeclado.nextLine();
		
		Competencia competencia = new Competencia(nome);
		
		competenciaVetor.append(competencia);
		System.out.println("Competencia cadastrada com sucesso!!");
	}
	
}
