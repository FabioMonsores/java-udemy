// ONDE EST� O PROBLEMA?

//public class DesafioIf {
//	public static void main(String[] args) {
//		double nota = 1.3;
//
//		if (nota >= 9.0); {
//			System.out.println("Quadro de Honra!");
//			System.out.println("Voc� � fera!!!");
//		}
//	}
//}

package controle.exercicios;

/*Desafio de entender onde estava o problema pelo fato de nota ainda ser 
impressa na tela, mesmo n�o cumprindo os requisitos do IF, 
o problema era o ponto e v�rgula no in�cio da condi��o
*/

public class DesafioIf {
	public static void main(String[] args) {
		double nota = 1.3;

		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Voc� � fera!!!");
		}
	}
}