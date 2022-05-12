package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
/*
* length() s� foi poss�vel pois eu converti num1 para uma String, caso eu
* usasse o length() sem a convers�o, geraria um erro, pois o length n�o est�
* dispon�vel dentro do Integer ou int.
*/
		
//		Posso tamb�m fazer uma convers�o diretamente do Integer.
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
//		Posso converter tamb�m concatenando
		System.out.println(("" + num1).length()); //O java entender� que � uma convers�o.
		System.out.println(("" + num2).length()); 
		
//		A mesma coisa acontece para Long, Sougle, Short, n�o s� para int ou Integer.
	}
}
