package devdojo.operadoreslogicos;

import java.util.Locale;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário está fazendo o cadastro em um sistema - Por segurança, "admin" e "administrador" não podem ser cadastrados como nome de usuário.
		 * [ENG] The user is registering in a system - For security reasons, "admin" and "administrator" cannot be registered as usernames.
		 * [ESP] El usuario está registrándose en un sistema. Por motivos de seguridad, "admin" y "administrador" no pueden registrarse como nombre de usuario.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Usuário: ");
		String usuario = scanner.nextLine();
		
		if (usuario.equals("admin") || usuario.equals("administrador")) {
			System.out.print("Usuário inválido");
		} else {
			System.out.print(usuario + " cadastrado com sucesso!");
		}
		
		scanner.close();
	}
}
