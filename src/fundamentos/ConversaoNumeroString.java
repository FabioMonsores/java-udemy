package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
/*
* length() só foi possível pois eu converti num1 para uma String, caso eu
* usasse o length() sem a conversão, geraria um erro, pois o length não está
* disponível dentro do Integer ou int.
*/
		
//		Posso também fazer uma conversão diretamente do Integer.
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
//		Posso converter também concatenando
		System.out.println(("" + num1).length()); //O java entenderá que é uma conversão.
		System.out.println(("" + num2).length()); 
		
//		A mesma coisa acontece para Long, Sougle, Short, não só para int ou Integer.
	}
}
