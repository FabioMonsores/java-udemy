// ONDE ESTÁ O PROBLEMA?

//public class DesafioIf {
//	public static void main(String[] args) {
//		double nota = 1.3;
//
//		if (nota >= 9.0); {
//			System.out.println("Quadro de Honra!");
//			System.out.println("Você é fera!!!");
//		}
//	}
//}

package controle.exercicios;

/*Desafio de entender onde estava o problema pelo fato de nota ainda ser 
impressa na tela, mesmo não cumprindo os requisitos do IF, 
o problema era o ponto e vírgula no início da condição
*/

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.3;

		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!!!");
		}
	}
}