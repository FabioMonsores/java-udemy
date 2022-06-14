package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		Double n1 = input.nextDouble();
		
		System.out.println("Digite outro n�mero: ");
		Double n2 = input.nextDouble();
		
		System.out.println("Digite o valor da opera��o: ");
		String op = input.next();
		
		input.close();
		
		//L�gica
		
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);		
		
	}
}
