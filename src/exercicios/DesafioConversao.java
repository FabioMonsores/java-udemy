/*Calcular a m�dia de 3 sal�rios de uma pessoa,
o funcion�rio ter� que ter a flexibilidade em usar ponto ou v�rgula.*/

package exercicios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro sal�rio: ");
		String valor1 = ler.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo sal�rio: ");
		String valor2 = ler.nextLine().replace(",", ".");

		
		System.out.println("Digite o terceiro sal�rio: ");
		String valor3 = ler.nextLine().replace(",", ".");


		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A m�dia dos sal�rios �: " + media);
		
		ler.close();
	}

}
