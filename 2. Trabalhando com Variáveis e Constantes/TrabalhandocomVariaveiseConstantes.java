package desafios;

import java.util.Scanner;

public class TrabalhandocomVariaveiseConstantes {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = entrada.nextLine().replace(",", ".");

		System.out.print("Idade: ");
				
		int idade = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Altura: ");
		String alturaStr = entrada.nextLine().replace(",", ".");
		double altura = Double.parseDouble(alturaStr);

		System.out.printf("Olá, %s! você tem %d anos e %.2fm de Altura.", nome, idade, altura);
				
		entrada.close();
	}
}




