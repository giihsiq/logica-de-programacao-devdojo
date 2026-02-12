package devdojo.operadorescondicionais;

import java.util.Locale;
import java.util.Scanner;

public class MultiplosOuNaoMultiplos {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita um número e o sistema imprime se o número do input é múltiplo ou não múltiplo.
		 * [ENG] The user enters a number and the system prints whether the input number is a multiple or not.
		 * [ESP] El usuario introduce un número y el sistema imprime si el número introducido es múltiplo o no múltiplo.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("N1: ");
		int n1 = scanner.nextInt();
		
		System.out.print("N2: ");
		int n2 = scanner.nextInt();
		
		if (n1 > n2) {
			if (n1 % n2 == 0) {
				System.out.print("Múltiplos");
			} else {
				System.out.print("Não Múltiplos");
				}
			} else { 
				if (n2 % n1 == 0) {
					System.out.print("Múltiplos");
				} else {
					System.out.print("Não Múltiplos");
					}
			}
		
		scanner.close();
		
	}
}
