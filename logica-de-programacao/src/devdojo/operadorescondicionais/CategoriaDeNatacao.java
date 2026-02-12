package devdojo.operadorescondicionais;

import java.util.Locale;
import java.util.Scanner;

public class CategoriaDeNatacao {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita a nome e idade para o cadastro de uma competição de natação, e o sistema calcula em qual categoria o participante se encaixa.
		 * [ENG] The user enters their name and age to register for a swimming competition, and the system calculates which category the participant fits into.
		 * [ESP] El usuario introduce su nombre y edad para inscribirse en una competición de natación, y el sistema calcula en qué categoría encaja el participante.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		
		if (idade < 10) {
			System.out.print(nome + " é adequado para a categoria infantil");
		} else if (idade >= 10 && idade <= 15) {
			System.out.print(nome + " é adequado para a categoria juvenil");
		} else if (idade >= 16 && idade <= 19) {
			System.out.print(nome + " é adequado para a categoria pré-adulto");
		} else {
			System.out.print(nome + " é adequado para a categoria adulto");
		}
		
		scanner.close();
		
	}
}
