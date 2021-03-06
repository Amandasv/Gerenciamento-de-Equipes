import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Gerenciador {

	public static void main(String[] args) {
		
		try {
			(new Gerenciador()).run();
		} catch (FileNotFoundException e) {
			System.err.println("Nao encontrou arquivo.");
			System.err.println(e.getMessage());
		}
	}
	
	Scanner leitorTeclado = new Scanner(System.in);
	
	Parser<Projeto> projetoParser = new ProjetoParser();
	Vetor<Projeto> projetoVetor = new Vetor<>();
	Projeto projetoObjeto = null;
	
	Parser<Competencia> competenciaParser = new CompetenciaParser();
	Vetor<Competencia> competenciaVetor = new Vetor<>();
	Competencia competenciaObejto = null;
	
	Parser<Colaborador> colaboradorParser = new ColaboradorParser();
	Vetor<Colaborador> colaboradorVetor = new Vetor<>();
	Colaborador colaboradorObejto = null;
	
	Parser<Funcionario> funcionarioParser = new FuncionarioParser();
	Vetor<Funcionario> funcionarioVetor = new Vetor<>();
	Funcionario funcionarioObjeto = null;

	private void run() throws FileNotFoundException {
		
		importaDados("src/ArquivosCSV/projetos.csv", projetoObjeto, projetoParser, projetoVetor);
		importaDados("src/ArquivosCSV/competencias.csv", competenciaObejto, competenciaParser, competenciaVetor);
		importaDados("src/ArquivosCSV/colaboradores.csv", colaboradorObejto, colaboradorParser, colaboradorVetor);
		importaDados("src/ArquivosCSV/funcionarios.csv", funcionarioObjeto, funcionarioParser, funcionarioVetor);
				
		System.out.println("====================================================");
		System.out.println("Sistema de Gerenciamento de Equipes por Competências");
		System.out.println("====================================================");
		
		Menu menuInicial = new Menu();
		Menu menuConsultar = new Menu();
		Menu menuConsultaFiltrada = new Menu();
		Menu menuCadastrar = new Menu();
		Menu menuDeletar = new Menu();
		
				
		
		Opcao consultar = new Opcao("Consultar");
		menuInicial.addOption(consultar);
		
		Opcao cadastrar = new Opcao("Cadastrar");
		menuInicial.addOption(cadastrar);
		
		Opcao excluir = new Opcao("Excluir");
		menuInicial.addOption(excluir);
		
		Opcao sair = new Opcao("Sair");
		menuInicial.addOption(sair);	
	
		Opcao voltar = new Opcao("Voltar");
		
		Opcao consularProjetos = new Opcao("Consultar Projetos");
		menuConsultar.addOption(consularProjetos);
		
		Opcao consultarPrAtivos = new Opcao("Projetos Ativos");
		menuConsultaFiltrada.addOption(consultarPrAtivos);
		
		Opcao consultarPrInativos = new Opcao("Projetos Inativos");
		menuConsultaFiltrada.addOption(consultarPrInativos);
		
		Opcao consultarPrTodos = new Opcao("Todos Projetos");
		menuConsultaFiltrada.addOption(consultarPrTodos);
		
		Opcao consultarCompetencias = new Opcao("Consultar Competencias");
		menuConsultar.addOption(consultarCompetencias);
		
		Opcao consultarColaborador = new Opcao("Consultar Colaboradores");
		menuConsultar.addOption(consultarColaborador);
		
		Opcao consultarFuncionarios = new Opcao("Consultar Funcionarios");
		menuConsultar.addOption(consultarFuncionarios);
		
		menuConsultar.addOption(voltar);
		
		Opcao cadastrarProjetos = new Opcao("Cadastrar Projetos");
		menuCadastrar.addOption(cadastrarProjetos);
		
		Opcao cadastrarCompetencias = new Opcao("Cadastrar Competencias");
		menuCadastrar.addOption(cadastrarCompetencias);
				
		Opcao associarColaborador = new Opcao("Associar Colaborador");
		menuCadastrar.addOption(associarColaborador);
		
		Opcao cadastrarFuncionarios = new Opcao("Cadastrar Funcionarios");
		menuCadastrar.addOption(cadastrarFuncionarios);		
		
		menuCadastrar.addOption(voltar);
		
		Opcao deletarProjetos = new Opcao("Deletar Projetos");
		menuDeletar.addOption(deletarProjetos);					
		
		Opcao deletarComptencias = new Opcao("Deletar Competencias");
		menuDeletar.addOption(deletarComptencias);
		
		Opcao deletarColaborador = new Opcao("Deletar Colaborador");
		menuDeletar.addOption(deletarColaborador);
		
		Opcao deletarFuncionarios = new Opcao("Deletar Funcionarios");
		menuDeletar.addOption(deletarFuncionarios);
		
		menuDeletar.addOption(voltar);
		
		
		do {
			System.out.println("");
			menuInicial.show();
			switch (menuInicial.getOption()) {
			
			case 1:
				System.out.println("\nO que você gostaria de consultar?");
				menuConsultar.show();
				
				switch (menuConsultar.getOption()) {

				case 1:
					System.out.println("\nQuais projetos deseja consultar?");
					menuConsultaFiltrada.show();
					
					switch (menuConsultaFiltrada.getOption()) {
					case 1:
						System.out.println("\n>Projetos Ativos:\n");
						for (int indiceProjetos = 0; indiceProjetos < projetoVetor.size(); indiceProjetos++) {
							if(projetoVetor.get(indiceProjetos).getSituacaoAtiva()){
								System.out.println("Indice: "+ indiceProjetos + " | " + projetoVetor.get(indiceProjetos));
							}
						}
						
						break;
						
					case 2:
						System.out.println("\n>Projetos Inativos:\n");
						for (int indiceProjetos = 0; indiceProjetos < projetoVetor.size(); indiceProjetos++) {
							if(projetoVetor.get(indiceProjetos).getSituacaoAtiva() == false){
								System.out.println("Indice: "+ indiceProjetos + " | " + projetoVetor.get(indiceProjetos));
							}
						}
						
						break;
					case 3:
						System.out.println("\n>Projetos:\n");
						projetoVetor.getVetor();
					default:
						break;
					}					
					break;
				case 2:				
					System.out.println("\n>Competencias:\n");
					competenciaVetor.getVetor();
					break;
				case 3:				
					System.out.println("\n>Colaboradores:\n");
					colaboradorVetor.getVetor();					
					break;
				case 4:
					System.out.println("\n>Funcionarios:\n");
					funcionarioVetor.getVetor();
					break;				
				default:
					break;
				}
				break;
				
			case 2:
				System.out.println("\nO que você gostaria de cadastrar?");
				menuCadastrar.show();
				Cadastros cadastro = new Cadastros();
				
				switch (menuCadastrar.getOption()) {

				case 1:	
					cadastro.cadastraProjeto(competenciaVetor, projetoVetor);					
					break;
				case 2:
					cadastro.cadastraCompetencias(competenciaVetor);
					break;
				case 3:
					cadastro.associarColaborador(colaboradorVetor, funcionarioVetor, projetoVetor);
					break;
				case 4:
					cadastro.cadastraFuncionario(competenciaVetor, funcionarioVetor);
					break;				
				default:
					break;
				}
				break;
				
			case 3:	
				System.out.println("\nO que você gostaria de deletar?");
				menuDeletar.show();
				switch (menuCadastrar.getOption()) {

				case 1:
					System.out.println("\n>Projetos atuais:\n");
					projetoVetor.getVetor();
					
					System.out.print("\nDigite o indice do projeto que deseja excluir:");										
					int excluirP = leitorTeclado.nextInt();	
					System.out.println("Excluindo o projeto: " + projetoVetor.get(excluirP).getNome());
					projetoVetor.remove(excluirP);
					
					System.out.println("Excluido com sucesso!");
					
					break;
				case 2:				
					System.out.println("\n>Competencias atuais:\n");
					competenciaVetor.getVetor();
										
					System.out.print("\nDigite o indice da competencia que deseja excluir:");
					int excluirC = leitorTeclado.nextInt();	
					System.out.println("Excluindo a competencia: " + competenciaVetor.get(excluirC).getNomeCompetencia());
					competenciaVetor.remove(excluirC);
					
					System.out.println("Excluido com sucesso!");
					break;
				case 4:
					System.out.println("\n>Funcionarios atuais:\n");
					funcionarioVetor.getVetor();
										
					System.out.print("\nDigite o indice do funcionario que deseja excluir: ");
					int excluirF = leitorTeclado.nextInt();	
					System.out.println("Excluindo o funcionario: " + funcionarioVetor.get(excluirF).getNome());
					funcionarioVetor.remove(excluirF);
					
					System.out.println("Excluido com sucesso!");
					break;				
				default:
					break;
				}				
				break;						
			default:
				System.exit(-1);
			}
		} while (true);
		
	}
					
	private <V> void importaDados(String arquivoCaminho, V objeto, Parser parser, Vetor<V> vetor) throws FileNotFoundException{
		LeitorCSV<V> leitor = new LeitorCSV<>(arquivoCaminho, parser);
		leitor.skipLine();
		
		while(leitor.hasNext()){
			objeto = leitor.readObject();
			vetor.append(objeto);
		}
		
		leitor.close();
	}
	
	
}
