package desafios;

import java.util.Scanner;

public class OperadoresAritmeticoseRelacionais {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		try {
		System.out.print("Digite o 1ª Número: ");
		String numero01 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite a operação: ");
		String operacao = entrada.nextLine().replace(",",".").trim();

		System.out.print("Digite o 2ª Número: ");
		String numero02 = entrada.nextLine().replace(",", ".");

		double number01 = Double.parseDouble(numero01.trim());
		double number02 = Double.parseDouble(numero02.trim());

		double resultado = 
		operacao.equals("+") ? number01 + number02:
		operacao.equals("*") ? number01 * number02: 
	    operacao.equals("-") ? number01 - number02 : 
	    operacao.equals("/") ? number01 / number02 : 0;
		
		System.out.println("O resultado é: " + resultado);
		
	    System.out.println("O primeiro número é maior, menor ou igual ao segundo? ");
		if (number01 > number02){
		System.out.println("É Maior");
		}
		else if (number01 == number02){
			System.out.println("É Igual");
		}
		else {
			System.out.println("É Menor");
			}	
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, digite apenas números.");
        }
		
		entrada.close();
	}
}
