package devdojo.lacosderepeticao.whiles;

import java.util.Locale;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário quer um menu interativo através de números, tendo como opção: Calcular imposto, Depositar salário e Sair - onde só encerra a interação ao digitar o número 3.
		 * [ENG] The user wants an interactive menu using numbers, with the following options: Calculate tax, Deposit salary, and Exit - where the interaction only ends when the number 3 is entered.
		 * [ESP] El usuario desea un menú interactivo mediante números, con las siguientes opciones: Calcular impuestos, Depositar salario y Salir - donde solo se cierra la interacción al introducir el número 3.
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int opcao = 0;
		
		while (opcao != 3) {
			System.out.println("Menu:");
			System.out.println("1 - Calcular imposto");
			System.out.println("2 - Depositar salário");
			System.out.println("3 - Sair");
			
			System.out.println();
			opcao = scanner.nextInt();
		}
		
		scanner.close();
		
	}

}
