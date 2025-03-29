package desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCompleta {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String continuar;

		do {
			try {
				System.out.println("Número 1: ");
				double numero1 = entrada.nextDouble();

				System.out.println("Escolha uma operação (+, -, *, /): ");
				String operacao = entrada.next();

				System.out.println("Número 2: ");
				double numero2 = entrada.nextDouble();

				double resultado = 
					   operacao.equals("+") ? numero1 + numero2 :
					   operacao.equals("-") ? numero1 - numero2 :
					   operacao.equals("*") ? numero1 * numero2 :
					   operacao.equals("/") ? numero1 / numero2 : 0;

				System.out.println("Resultado: " + resultado);
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, insira um número.");
				entrada.next(); // Limpa a entrada inválida
			}
			System.out.println("Deseja realizar outra operação? (s/n): ");
			continuar = entrada.next();
		} while (continuar.equalsIgnoreCase("s"));

		entrada.close();
	}
}
