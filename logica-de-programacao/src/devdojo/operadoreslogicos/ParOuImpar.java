package devdojo.operadoreslogicos;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário quer saber se o número é par ou ímpar.
		 * [ENG] The user wants to know if the number is even or odd.
		 * [ESP] El usuario quiere saber si el número es par o impar.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrada: ");
		int n = scanner.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		
		scanner.close();
	}

}
