/*Calcular a média de 3 salários de uma pessoa,
o funcionário terá que ter a flexibilidade em usar ponto ou vírgula.*/

package exercicios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro salário: ");
		String valor1 = ler.nextLine().replace(",", ".");
		
		System.out.println("Digite o segundo salário: ");
		String valor2 = ler.nextLine().replace(",", ".");

		
		System.out.println("Digite o terceiro salário: ");
		String valor3 = ler.nextLine().replace(",", ".");


		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é: " + media);
		
		ler.close();
	}

}
