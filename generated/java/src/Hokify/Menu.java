package Hokify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
	static BufferedReader br;
	
	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		Hokify hk = new Hokify();
		Utilizador user =
		        new Utilizador(
		            "Pedro",
		            "email@email.com",
		            Hokify_quotes.MasculinoQuote.getInstance(),
		            Hokify_quotes.LicenciaturaQuote.getInstance(),
		            "Portugal",
		            "Porto",
		            27L,
		            123456789L,
		            1990L,
		            9L,
		            8L);
		
		System.out.println("NOME:" + user.toString());
		
		menuInicial();
	}
	
	public static void menuTrabalhos() throws NumberFormatException, IOException {
		System.out.println("================================");
		System.out.println("===          Hokify          ===");
		System.out.println("================================");
		System.out.println("===  1 - Listar Trabalhos    ===");
		System.out.println("===  2 - Adicionar Trabalhos ===");
		System.out.println("===  3 - Pesquisar Trabalhos ===");
		System.out.println("===  4 - Voltar              ===");
		System.out.println("================================");
		System.out.print("Por favor escolha uma opção >");
		
		int opcao = Integer.parseInt(br.readLine());
		switch (opcao) {
		case 1:
			clearScreen();
			menuInicial();
			break;
		case 2:
			clearScreen();
			menuInicial();
			break;
		case 3:
			clearScreen();
			menuInicial();
		case 4:
			clearScreen();
			menuInicial();
			break;
		default:
			break;
		}
	}
	
	public static void menuUtilizadores() throws NumberFormatException, IOException {
		System.out.println("==================================");
		System.out.println("===           Hokify           ===");
		System.out.println("==================================");
		System.out.println("=== 1 - Listar Utilizadores    ===");
		System.out.println("=== 2 - Adicionar Utilizadores ===");
		System.out.println("=== 3 - Pesquisar Utilizadores ===");
		System.out.println("=== 4 - Voltar                 ===");
		System.out.println("==================================");
		System.out.print("Por favor escolha uma opção >");
		
		int opcao = Integer.parseInt(br.readLine());
		switch (opcao) {
		case 1:
			clearScreen();
			menuInicial();
			break;
		case 2:
			clearScreen();
			menuInicial();
			break;
		case 3:
			clearScreen();
			menuInicial();
		case 4:
			clearScreen();
			menuInicial();
			break;
		default:
			break;
		}
	}
	
	public static void menuInicial() throws NumberFormatException, IOException {
		System.out.println("================================");
		System.out.println("===          Hokify          ===");
		System.out.println("================================");
		System.out.println("===    1 - Utilizadores      ===");
		System.out.println("===    2 - Trabalhos         ===");
		System.out.println("===    3 - Sair              ===");
		System.out.println("================================");
		System.out.print("Por favor escolha uma opção >");
		
		int opcao = Integer.parseInt(br.readLine());
		

		switch (opcao) {
		case 1:
			clearScreen();
			menuUtilizadores();
			break;
		case 2:
			clearScreen();
			menuTrabalhos();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			break;
		}
		
	}
	
	
	public static void clearScreen() {  
		for (int i = 0; i < 50; ++i) System.out.println();
	}  
}
