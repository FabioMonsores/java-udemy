package fundamentos.exercicios;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		//trabalho terça (v ou f)
		//trabalho quinta (v ou f)
		
		//Se os dois trabalhos derem certo, comprar tv de 50"
		//Se apenas um trabalho der certo, comprar uma tv de 32"
		//Comprando a tv de 50 ou 32, família ir pro shopping tomar sorvete
		//Caso quinta e terça não tenha trabalho, família ficar em casa
		
		boolean trabalhoTerca, trabalhoQuinta;
		
//		A mudança de TRUE e FALSE ditam a resposta do problema
		trabalhoTerca = true;
		trabalhoQuinta = true;
		
		boolean comprouTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
		
//		Operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50\"? " + comprouTV50);
		System.out.println("Comprou TV de 32\"? " + comprouTV32);
		System.out.println("Comprou TV 32\" ou 50\" e Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saudável? " + maisSaudavel);
		
	}

}
