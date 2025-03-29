package desafios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaCondicional_If_Else_If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		try {
			int idade = entrada.nextInt();

			if (idade <= 0) {
				System.out.println("Idade inválida. Por favor, insira uma idade não negativa. ");
			} else if (idade >= 65) {
				System.out.println("Você é um(a) Idoso(a)!");
			} else if (idade >= 0 && idade <= 12) {
				System.out.println("Você é uma Criança!");
			} else if (idade >= 13 && idade <= 17) {
				System.out.println("Você é um Adolescente!");
			} else if (idade >= 18 && idade <= 64) {
				System.out.println("Você é um Adulto!");
			}
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
		}
		entrada.close();
	}
}
