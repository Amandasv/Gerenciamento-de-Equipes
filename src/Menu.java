import java.util.Scanner;

public class Menu {	
	
	Opcao[] opcoes = new Opcao[10];
	int numOpcoes = 0;

	public void addOption(Opcao opcao) {
		opcoes[numOpcoes] = opcao;
		numOpcoes++;
	}

	public void show() {		
		for (int i = 0; i < numOpcoes; i++) {
			System.out.print("[" + i+1 + "] " + opcoes[i].getTexto());
			if(i==numOpcoes-1){
				System.out.print("["+"0"+"] " + opcoes[i].getTexto());
			}
		}		
		System.out.println("Escolha uma opcao: ");
	}

	public int getOption() {		
		Scanner leitor = new Scanner(System.in);
		
		
		
		int opcao = leitor.nextInt();
		return opcao;		
	}//fecha getOption
	
	
}
