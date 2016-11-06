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
	Vetor<Funcionario> FuncionarioVetor = new Vetor<>();
	Funcionario funcionarioObjeto = null;

	private void run() throws FileNotFoundException {
		
		importaDados("src/ArquivosCSV/projetos.csv", projetoObjeto, projetoParser, projetoVetor);
		importaDados("src/ArquivosCSV/competencias.csv", competenciaObejto, competenciaParser, competenciaVetor);
		importaDados("src/ArquivosCSV/colaboradores.csv", colaboradorObejto, colaboradorParser, colaboradorVetor);
		importaDados("src/ArquivosCSV/funcionarios.csv", funcionarioObjeto, funcionarioParser, FuncionarioVetor);
		
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
