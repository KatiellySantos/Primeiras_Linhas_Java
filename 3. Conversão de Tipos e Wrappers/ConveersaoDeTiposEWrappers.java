package desafios;

import java.util.Scanner;

public class ConveersaoDeTiposEWrappers {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String numeroStr = entrada.nextLine().replace(",", ".");

        double numero = Double.parseDouble(numeroStr);

        System.out.printf("O dobro de %.2f é %.2f%n", numero, numero * 2);

        entrada.close();
    }
}
