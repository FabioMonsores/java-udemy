package fundamentos.exercicios;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//trabalho ter�a (v ou f)
		//trabalho quinta (v ou f)
		
		//Se os dois trabalhos derem certo, comprar tv de 50"
		//Se apenas um trabalho der certo, comprar uma tv de 32"
		//Comprando a tv de 50 ou 32, fam�lia ir pro shopping tomar sorvete
		//Caso quinta e ter�a n�o tenha trabalho, fam�lia ficar em casa
		
		boolean trabalhoTerca, trabalhoQuinta;
		
//		A mudan�a de TRUE e FALSE ditam a resposta do problema
		trabalhoTerca = true;
		trabalhoQuinta = true;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		
//		Operador Un�rio
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Comprou TV 32\" ou 50\" e Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saud�vel? " + maisSaudavel);
		
	}

}
