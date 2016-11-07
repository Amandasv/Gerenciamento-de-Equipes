import java.time.LocalDate;
import java.util.Scanner;

public class Cadastros {
	
	Projeto projetoObjeto = null;
	Competencia competenciaObejto = null;
	Colaborador colaboradorObejto = null;
	Funcionario funcionarioObjeto = null;
	
	Scanner leitorTeclado = new Scanner(System.in);
	
	public void cadastraProjeto(Vetor<Competencia> competenciaVetor, Vetor<Projeto> projetoVetor ){
		System.out.println("\n>Novo Projeto\n");
		
		System.out.print("Nome do projeto: ");
		String nome = leitorTeclado.nextLine();
		
		System.out.print("Data de inicio [AAAA-MM-DD]: ");		
		LocalDate inicio = LocalDate.parse(leitorTeclado.next());
		
		System.out.print("Data final [AAAA-MM-DD]: ");		
		LocalDate fim = LocalDate.parse(leitorTeclado.next());
		
		System.out.print("Numero de competencias: ");
		int numCompetencias = leitorTeclado.nextInt();
		
		Projeto projeto = new Projeto(nome, inicio, fim, numCompetencias);
		System.out.println("\nDigite o indice da competencia desejada:\n");
		competenciaVetor.getVetor();
		
		for (int i = 0; i < numCompetencias; i++) {
			System.out.print("\nCompetencia [" + (i+1) + "]:");
			int escolhido = leitorTeclado.nextInt();				
			String nomeCompetencia = competenciaVetor.get(escolhido).getNomeCompetencia();
			System.out.print("Competencia [" + (i+1) + "]: "+nomeCompetencia);
			projeto.setCompetencia(i, nomeCompetencia);
		}	
		
		projetoVetor.append(projeto);
		System.out.println("\n\nProjeto cadastrado com sucesso!!");
	}
	
	public void cadastraFuncionario(Vetor<Competencia> competenciaVetor, Vetor<Funcionario> funcionarioVetor){
		System.out.println("\n>Novo Funcionario\n");
		
		System.out.print("Nome completo: ");
		String nome = leitorTeclado.nextLine();
		
		System.out.print("Salario: ");
		Double salario = leitorTeclado.nextDouble();
		
		System.out.print("Numero de competencias: ");
		int numCompetencias = leitorTeclado.nextInt();
		
		Funcionario funcionario = new Funcionario(nome, salario, numCompetencias);	
		
		System.out.println("\nDigite o indice da competencia desejada:");
		competenciaVetor.getVetor();
		
		for (int i = 0; i < numCompetencias; i++) {
			System.out.print("\nCompetencia [" + (i+1) + "]:");
			int escolhido = leitorTeclado.nextInt();				
			String nomeCompetencia = competenciaVetor.get(escolhido).getNomeCompetencia();
			System.out.print("Competencia [" + (i+1) + "]: "+nomeCompetencia);
			funcionario.setCompetencia(i, nomeCompetencia);
		}		
		
		funcionarioVetor.append(funcionario);
		System.out.println("\n\nFuncionário cadastrado com sucesso!!");		
	}
	
	public void cadastraCompetencias(Vetor<Competencia> competenciaVetor){
		System.out.println("\nCompetencias atuais:\n");
		competenciaVetor.getVetor();
		System.out.println("\n>Nova Competencia\n");
		System.out.print("Nome: ");
		String nome = leitorTeclado.nextLine();
		
		Competencia competencia = new Competencia(nome);
		
		competenciaVetor.append(competencia);
		System.out.println("\nCompetencia cadastrada com sucesso!!");
	}
	
	public void associarColaborador(Vetor<Colaborador> colaboradorVetor, Vetor<Funcionario> funcionarioVetor, Vetor<Projeto> projetoVetor){
		
		System.out.println("\nEsses sao os projetos que voce pode associar\n");
		projetoVetor.getVetor();
		
		System.out.print("\nDigite o indice do projeto desejado: ");
		int indiceProjeto = leitorTeclado.nextInt();
		
		System.out.println("\nProjeto:");

		Projeto projetoEscolhido = projetoVetor.get(indiceProjeto);  		
		
		System.out.println(projetoEscolhido);		
		String nomeProjeto = projetoEscolhido.getNome();
		
		System.out.println("Agora voce precisa escolher o funcionario para associar ");

		System.out.println("\nEsses sao os funcionarios disponiveis \n");
		funcionarioVetor.getVetor();
		System.out.print("Digite o indice do funcionario desejado: ");
		int indiceFuncionario = leitorTeclado.nextInt();
		
		System.out.print("\nFuncionario: \n");			
		Funcionario funcionarioEscolhido = funcionarioVetor.get(indiceFuncionario);
		System.out.print(funcionarioEscolhido);
		String nomeFuncionario = funcionarioEscolhido.getNome();
		
		System.out.println("\nSobre qual competencia de " + nomeFuncionario + " voce deseja associar? \n");			
		funcionarioEscolhido.getCompetencias();
		
		System.out.print("\nDigite o indice da competencia desejada: ");
		int indiceCompetencia = leitorTeclado.nextInt();
		
		System.out.println("\n" + funcionarioEscolhido.getNomeCompetencia(indiceCompetencia));
		String competencia = funcionarioEscolhido.getNomeCompetencia(indiceCompetencia);
		
		System.out.println("\nInformacoes a serem associadas:\n");

		System.out.println(">Projeto: ");
		System.out.println(projetoEscolhido);
		System.out.println(">Funcionario: ");
		System.out.println(funcionarioEscolhido);
		System.out.println(">Competencia: ");
		System.out.println(competencia);
		
		System.out.println("\nDigite 1 se voce confirma");
		int confirma = leitorTeclado.nextInt();
		
		if(confirma == 1){
			Colaborador colaborador = new Colaborador(nomeProjeto, nomeFuncionario, competencia);
			colaboradorVetor.append(colaborador);
			
			System.out.println("\nAssociacao feita com sucesso!!");
		}
		
	}
	
}
