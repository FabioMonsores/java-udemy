package fundamentos;

public class TipoString {

	public static void main(String[] args) {

//		Digamos que String é o "nono tipo primitivo" de JAVA, porém String recebe um tratamento especial por parte do java
//		String é um objeto imutável.
		
		System.out.println("Olá pessoal".charAt(2));//Imprime a letra na posição 2 da String.
		
//		.charAt(()); é uma funcionalidade pertencente a String
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
//		Retornará um valor booleano dizendo se é verdade ou não (true or false) que a minha String começa com o valor digitado entre parênteses, no caso ("BOA").
		
		System.out.println(s.length());//Dirá quantos caracteres tem na minha String - retorna um valor inteiro.
		
		System.out.println(s.endsWith("tarde")); 
//		Funciona da mesma forma que o .startsWith(());, porém com o término na string.
		
		System.out.println(s.equals("boa tarde"));
//		retorna um valor false, pois leva em consideração os "cases", maiúsculo e minúsculo.
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));
//		retorna verdadeiro, pois como o nome já diz, ele ignora os cases.
		
		System.out.println(s.toLowerCase().equals("boa tarde"));
//		Uma outra forma de "escrever" o equalsIgnoreCase()
		
//		Uma variável também aceita ponto, como se fosse tipo String
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
//		Situações de concatenação;
		
		System.out.println("Nome: " + nome + "\n Sobrenome: " + sobrenome + "\n Idade: " + idade + "\n Salario " + salario);
		
//		Não é legal e chega ser cansativo sempre ficar concatenando com o "+", então, existe uma outra forma de escrever sem ficar tão cansativo.
//		Usando o String de formatação System.out.printf(s, args);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario); //String de formatação
		
//		Também posso fazer isso com String, usando String frase = String.format(s, args);
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		/* Formatação de saída
		 * 		  
		 * %s - retorna string 
		 * %c - retorna char
		 * %d - retorna inteiro 
		 * %f - retorna float ou double
		 * %.2f- retorna float ou double com duas casas decimais
		 * 
		 */
	}
}
