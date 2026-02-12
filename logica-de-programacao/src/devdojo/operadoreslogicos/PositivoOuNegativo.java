package devdojo.operadoreslogicos;

import java.util.Locale;
import java.util.Scanner;

public class PositivoOuNegativo {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita um número e o sistema imprime se é positivo, neutro ou negativo.
		 * [ENG] The user enters a number and the system prints whether it is positive, neutral, or negative.
		 * [ESP] El usuario introduce un número y el sistema imprime si es positivo, neutro o negativo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Entrada: ");
		int n = scanner.nextInt();
		
		if (n > 0) {
			System.out.println("Positivo");
		} else if (n == 0) {
			System.out.println("Neutro");
		} else {
			System.out.println("Negativo");
		}
		
		scanner.close();

	}
}
