package desafios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EstruturadeControleDoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String menu = "";

		do {
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Ver data atual  \n" + "2 - Mensagem de saudação  \n" + "3 - Sair   ");
			menu = entrada.nextLine();

			if (menu.equalsIgnoreCase("1")) {
				DateTimeFormatter dtf = DateTimeFormatter
						.ofPattern("dd-MM-yyyy HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				System.out.println("Data atual: " + dtf.format(now));
			} else if (menu.equalsIgnoreCase("2"))
				System.out.println("Obrigada!");

			System.out.println();

		} while (!menu.equalsIgnoreCase("3"));
		System.out.println("Sair");

		entrada.close();
	}
}
