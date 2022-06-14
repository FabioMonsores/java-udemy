package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a média: ");
		double media = input.nextDouble();
		input.close();

		if (media >= 7 && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns");
		}

		// posso também usar else if
		if (media >= 4.5 && media < 7) {
			System.out.println("Recuperação!");
		}

		if (media < 4.5 && media >= 0) {
			System.out.println("REPROVADO!");
		}
		
		else {
			System.out.println("Digite um número maior que 0 e menor ou igual a 10");
		}
	}
}
