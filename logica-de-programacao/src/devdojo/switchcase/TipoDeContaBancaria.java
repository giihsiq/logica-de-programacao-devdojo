package devdojo.switchcase;

import java.util.Locale;
import java.util.Scanner;

public class TipoDeContaBancaria {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita qual é o tipo de conta que deseja criar, e o sistema imprime a porcentagem de juros para depósito.
		 * [ENG] The user enters the type of account they wish to create, and the system prints the interest rate for deposits.
		 * [ESP] El usuario introduce el tipo de cuenta que desea crear y el sistema imprime el porcentaje de interés para el depósito.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual o tipo da conta?");
		System.out.println("1 = Conta Poupança");
		System.out.println("2 = Conta Corrente");
		System.out.println("3 = Conta Investimento");
		
		int n = scanner.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Conta Poupança = 0.05%");
		break;
		case 2:
			System.out.println("Conta Corrente = 0.02%");
		break;
		case 3:
			System.out.println("Conta Investimento = 0.1%");
		break;
		default:
			System.out.println("Operação inválida ou incorreta.");
		break;
		}
		
	    scanner.close();
		
	}
}
