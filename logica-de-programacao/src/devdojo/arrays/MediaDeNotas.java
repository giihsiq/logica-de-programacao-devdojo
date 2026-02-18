package devdojo.arrays;

import java.util.Locale;
import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O programa deve calcular e exibir a soma e média das notas digitado pelo usuário.
		 * [ENG] The program should calculate and display the sum and average of the grades entered by the user.
		 * [ESP] El programa debe calcular y mostrar la suma y la media de las notas introducidas por el usuario.
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0.0;
		
		int i = 0;
		for (i = 0; i < notas.length; i++) {
			System.out.print("Nota: ");
			notas[i] = scanner.nextDouble();
			soma += notas[i];
		}
		
		System.out.println("Soma: " + soma);
		
		double media = soma / notas.length;
		System.out.print("Média: " + media);
		
		scanner.close();
		
	}

}
