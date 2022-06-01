package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {

//		IMPORTANTE, SEMPRE QUE COMPARAR STRINGS, USAR O EQUALS
		System.out.println("2" == "2");

		String s1 = new String("2");
		System.out.println("2" == s1); // Não são iguais
		System.out.println("2".equals(s1)); // Agora é verdadeiro

//		Equals compara os conteúdos e não vai entrar em outra questão interna dentro da linguagem.

		Scanner entrada = new Scanner(System.in);

		String s2 = entrada.next(); // .next() já tira os espaços em branco, já .nextLine() não.
		System.out.println("2" == s2.trim()); // .trim() retira os espaços em branco
		System.out.println("2".equals(s2.trim()));

		entrada.close();

	}
}
