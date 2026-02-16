package devdojo.lacosderepeticao.whiles;

import java.util.Locale;
import java.util.Scanner;

public class NumerosImpares {

	public static void main(String[] args) {

		/*
		 * [PT-BR] O usuário gostaria de imprimir todos os números ímpares de 0 até o valor digitado.
		 * [ENG] The user would like to print all odd numbers from 0 up to the entered value.
		 * [ESP] El usuario desea imprimir todos los números impares desde el 0 hasta el valor introducido.
		 */
		
		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o número: ");
		int n = scanner.nextInt();
		
		int i = 0;
		
		while (i <= n) {
			i = i + 1;
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scanner.close();
		
	}

}
