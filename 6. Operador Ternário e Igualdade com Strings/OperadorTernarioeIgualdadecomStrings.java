package desafios;

import java.util.Scanner;

public class OperadorTernarioeIgualdadecomStrings {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean entradainvalida = true;
		do {
			System.out.println("Nome de usuário: ");
			String nome = entrada.nextLine();

			if (nome.equals("admin")) {
				System.out.println("Acesso Concedido!");
				entradainvalida = false;
			}
			else {
				System.out.println("Acesso Negado!");
			}
			;
		} while (entradainvalida);

		entrada.close();
	}
}
