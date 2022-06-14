package fundamentos.exercicios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		Double n1 = input.nextDouble();
		
		System.out.println("Digite outro número: ");
		Double n2 = input.nextDouble();
		
		System.out.println("Digite o valor da operação: ");
		String op = input.next();
		
		input.close();
		
		//Lógica
		
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1, op, n2, resultado);		
		
	}
}
