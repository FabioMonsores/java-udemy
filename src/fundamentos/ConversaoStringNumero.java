package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {

		/*
		 * IMPORTANTE!!!
		 * 
		 * String para N�mero � uma convers�o perigosa.
		 * 
		 * Nem toda String pode ser convertida para um n�mero; Mas todo n�mero pode ser
		 * convertido para uma String.
		 */

		// Classe visual (Janela visual)

		String valor1 = JOptionPane.showInputDialog
				("digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog
				("digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma �: " + soma);
		System.out.println("M�dia �: " + soma / 2);
		
		//Caso eu precise de algo com mais precis�o, posso usar o BigDecimal, dispon�vel em "import java.math.BigDecimal;"
		

	}
}
