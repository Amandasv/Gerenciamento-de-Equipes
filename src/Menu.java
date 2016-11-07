import java.util.Scanner;


public class Menu {	
	Scanner leitor = new Scanner(System.in);
	Opcao[] opcoes = new Opcao[15];
	int numOpcoes = 0;

	public void addOption(Opcao opcao) {
		opcoes[numOpcoes] = opcao;
		numOpcoes++;
	}
	
	/* 
	 * Console.print("\nMenu:\n");
		for (int i = 0; i < numOpcoes; i++) {
			Console.println("[", i + 1, "] ", opcoes[i].getTexto());
		}
		Console.println("ESCOLHA UMA OP��O: ");
	 * 
	 */

	public void show() {		
		
		for (int i = 0; i < numOpcoes; i++) {
			System.out.println("[" + (i+1) + "] " + opcoes[i].getTexto());			
		}		
		
	}

	public int getOption() {		
		int opcao = leitor.nextInt();
		return opcao;		
	}
	
	
}
