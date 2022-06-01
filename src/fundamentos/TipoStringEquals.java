package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {

//		IMPORTANTE, SEMPRE QUE COMPARAR STRINGS, USAR O EQUALS
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1); // N�o s�o iguais
		System.out.println("2".equals(s1)); // Agora � verdadeiro

//		Equals compara os conte�dos e n�o vai entrar em outra quest�o interna dentro da linguagem.

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next(); // .next() j� tira os espa�os em branco, j� .nextLine() n�o.
		System.out.println("2" == s2.trim()); // .trim() retira os espa�os em branco
		System.out.println("2".equals(s2.trim()));

		entrada.close();

	}
}
