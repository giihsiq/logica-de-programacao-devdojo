package devdojo.switchcase;

import java.util.Locale;
import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita o número do dia da semana, sendo segunda-feira o início da semana.
		 * [ENG] The user enters the number of the day of the week, with Monday being the start of the week.
		 * [ESP] El usuario introduce el número del día de la semana, siendo el lunes el inicio de la semana.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Dia da semana: ");
		int dia = scanner.nextInt();
		
		if (dia == 1) {
			System.out.print("Segunda-feira");
		} else if (dia == 2) {
			System.out.print("Terça-feira");
		} else if (dia == 3) {
			System.out.print("Quarta-feira");
		} else if (dia == 4) {
			System.out.print("Quinta-feira");
		} else if (dia == 5) {
			System.out.print("Sexta-feira");
		} else if (dia == 6) {
			System.out.print("Sábado");
		} else if (dia == 7) {
			System.out.print("Domingo");
		} else {
			System.out.print("Dia inválido.");
		}
		
	    scanner.close();
		
	}
}
