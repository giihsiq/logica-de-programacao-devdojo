package devdojo.operadorescondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Alistamento {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário digita o sexo e a idade, e o sistema calcula se está apto para o alistamento.
		 * [ENG] The user enters their gender and age, and the system calculates whether they are eligible for enlistment.
		 * [ESP] El usuario introduce su sexo y edad, y el sistema calcula si es apto para el alistamiento.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sexo (M/F): ");
	    String sexo = scanner.nextLine();
	    
	    System.out.print("Idade: ");
	    int idade = scanner.nextInt();
	    
	    if (sexo.equalsIgnoreCase("M") && idade >= 18) {
	    	System.out.print("Alistamento obrigatório");
	    } else if (sexo.equalsIgnoreCase("M") && idade < 18) {
	    	System.out.print("Alistamento não permitido");
	    } else if (sexo.equalsIgnoreCase("F") && idade >= 18) {
	    	System.out.print("Alistamento opcional");
	    } else if (sexo.equalsIgnoreCase("F") && idade < 18) {
	    	System.out.print("Alistamento não permitido");
	    } else {
	    	System.out.print("Dados inválidos.");
	    }
	    
	    scanner.close();
	    
	}
}
