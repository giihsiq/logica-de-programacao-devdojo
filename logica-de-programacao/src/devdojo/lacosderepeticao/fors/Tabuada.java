package devdojo.lacosderepeticao.fors;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O programa deve calcular e exibir a tabuada do número digitado pelo usuário.
		 * [ENG] The program should calculate and display the multiplication table for the number entered by the user.
		 * [ESP] El programa debe calcular y mostrar la tabla de multiplicar del número introducido por el usuario.
		 */

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int soma = 7 * i;
			System.out.println(n + " x " + i + " = " + soma);
		}
		
		scanner.close();
		
	}

}
