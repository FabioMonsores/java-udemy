package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {

		/*
		 * IMPORTANTE!!!
		 * 
		 * String para Número é uma conversão perigosa.
		 * 
		 * Nem toda String pode ser convertida para um número; Mas todo número pode ser
		 * convertido para uma String.
		 */

		// Classe visual (Janela visual)

		String valor1 = JOptionPane.showInputDialog
				("digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog
				("digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: " + soma / 2);
		
		//Caso eu precise de algo com mais precisão, posso usar o BigDecimal, disponível em "import java.math.BigDecimal;"
		

	}
}
