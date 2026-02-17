package devdojo.lacosderepeticao.whiles;

import java.util.Locale;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		/*
		 * [PT-BR] O usuário deve acertar o login de usuário e senha armazenado em constantes - "Acesso Liberado" caso acerte, e "Acesso Negado" caso erre, até acertar o login correto.
		 * [ENG] The user must enter the username and password stored in constants - “Access Granted” if correct, and “Access Denied” if incorrect, until the correct login is entered.
		 * [ESP] El usuario debe introducir correctamente el nombre de usuario y la contraseña almacenados en constantes: "Acceso permitido" si acierta y "Acceso denegado" si se equivoca, hasta que introduzca los datos correctos.
		 */

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		/* Constante = não pode ser alterado */
		final String usuario = "admin";
		final String senha = "admin";
		
		System.out.print("Usuário: ");
		String usuarioInserido = scanner.nextLine();
		
		System.out.print("Senha: ");
		String senhaInserida = scanner.nextLine();
		
		int i = 0;
		
		while (!usuarioInserido.equals(usuario) || !senhaInserida.equals(senha)) {
			i = i + 1;
			System.out.println("Acesso Negado.");
			
			System.out.print("Usuário: ");
			usuarioInserido = scanner.nextLine();
			
			System.out.print("Senha: ");
			senhaInserida = scanner.nextLine();
		}
		System.out.println("Acesso Liberado.");
		
		
		scanner.close();
		
	}

}
