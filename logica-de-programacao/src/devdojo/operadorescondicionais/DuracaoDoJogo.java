package devdojo.operadorescondicionais;

import java.util.Locale;
import java.util.Scanner;

public class DuracaoDoJogo {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário insere o horário de início e fim do jogo e o sistema imprime quanto tempo durou - O limite de duração de uma partida é de 24 horas.
		 * [ENG] The user enters the start and end times of the game, and the system prints how long it lasted - The time limit for a match is 24 hours.
		 * [ESP] El usuario introduce la hora de inicio y finalización del juego y el sistema imprime cuánto tiempo ha durado. El límite de duración de una partida es de 24 horas.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Início: ");
		int horaInicio = scanner.nextInt();
		
		System.out.println("Fim: ");
		int horaFim = scanner.nextInt();
		
		int calculo = horaInicio + horaFim;
		
		if (calculo <= 23) {
			System.out.println("O jogo durou " + calculo + " horas.");
		} else {
			System.out.println("O jogo durou 24 horas.");
		}
		
		scanner.close();
	}
}
