package desafios;

import java.util.Scanner;

public class TratamentodeErroscomInputMismatchException {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double numero = 0;
		boolean entradaValida = false;

		do {
			System.out.println("Digite um Número: ");
			String numeroStr = entrada.nextLine(); 

			try {
				numero = Double.parseDouble(numeroStr);
				entradaValida = true; 
			} catch (NumberFormatException e) {
				System.out.println("Entrada inválida! Digite um número válido.");
			}
		} while (!entradaValida); 

		System.out.println(numero);
		System.out.println("O dobro desse Número é: " + numero * 2);

		entrada.close();
	}
}
