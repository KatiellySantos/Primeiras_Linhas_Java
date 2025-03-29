package desafios;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Digite o Número: ");
		
		int numero = Integer.parseInt(valor);
        
		if (numero % 2 == 0) {
			System.out.println("O Número é Par");
		}
		else {
				System.out.println("O Número é Impar");
		}	
		
	}
}
