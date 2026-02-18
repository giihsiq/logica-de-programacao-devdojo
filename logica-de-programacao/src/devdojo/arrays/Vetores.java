package devdojo.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] Criar vetor v1 e v2, inserir valores e criar o vetor vr para exibir a soma dos dois vetores.
		 * [ENG] Create arrays v1 and v2, insert values, and create array vr to display the sum of the two vectors.
		 * [ESP] Crear los vectores v1 y v2, insertar valores y crear el vector vr para mostrar la suma de los dos vectores.
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		int[] v1 = new int[9];
		int[] v2 = new int[9];
		
		for (int i = 0; i < v1.length; i++) {
			System.out.print("Digite o valor (v1): ");
			v1[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < v2.length; i++) {
			System.out.print("Digite o valor (v2): ");
			v2[i] = scanner.nextInt();
		}
		
		int[] vr = new int[9];
		
		for (int i = 0; i < vr.length; i++) {
			vr[i] = v1[i] * v2[i];
			System.out.println("Posição: " + i + ", valor: " + vr[i]);
		}
		
		scanner.close();
		
	}
}
