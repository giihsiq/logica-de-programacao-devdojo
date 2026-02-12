package devdojo.operadorescondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita a idade e o sistema imprime se é adulto ou não adulto.
		 * [ENG] The user enters their age and the system prints whether they are an adult or a minor.
		 * [ESP] El usuario introduce la edad y el sistema imprime si es adulto o no adulto.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		
		if (idade >= 18) {
			System.out.print("Adulto");
		} else {
			System.out.print("Não é adulto");
		}
		
		scanner.close();
		
	}
}
