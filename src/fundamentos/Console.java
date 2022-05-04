package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom"); //Imprime um texto no console e permanecerá na mesma linha.
		System.out.print(" dia!\n\n");
		
		System.out.println("Boa"); //Imprime um texto, mas pula uma linha
		System.out.println("tarde!\n\n");
		
		System.out.printf("Mega Sena: %d %d %d %d %d %d", 1,2,3,4,5,6); //Imprime um texto formatado e %d representa inteiro
		
		System.out.printf("\n\nSalário: %.1f%n", 1234.5678); //%1.f retornará apenas uma casa decimal e representa float/double.

		System.out.printf("Nome: %s", "João"); //%s representa String
		
		Scanner entrada = new Scanner(System.in); //System.in quer dizer entrada de dados.
		
		System.out.println("\n\nDigite o seu nome: ");
		String nome = entrada.nextLine();
	
		
		System.out.println("\n\nDigite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\nDigite a sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.printf("\n\n %s %s tem %d anos. %n", nome, sobrenome, idade);
		
		entrada.close();
		
	}

}
