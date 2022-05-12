package fundamentos;

public class TipoString {

	public static void main(String[] args) {

//		Digamos que String é o "nono tipo primitivo" de JAVA, por?m String recebe um tratamento especial por parte do java
//		String ? um objeto imut?vel.
		
		System.out.println("Ol? pessoal".charAt(2));//Imprime a letra na posi??o 2 da String.
		
//		.charAt(()); ? uma funcionalidade pertencente a String
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
//		Retornar? um valor booleano dizendo se ? verdade ou n?o (true or false) que a minha String come?a com o valor digitado entre par?nteses, no caso ("BOA").
		
		System.out.println(s.length());//Dir? quantos caracteres tem na minha String - retorna um valor inteiro.
		
		System.out.println(s.endsWith("tarde")); 
//		Funciona da mesma forma que o .startsWith(());, por?m com o t?rmino na string.
		
		System.out.println(s.equals("boa tarde"));
//		retorna um valor false, pois leva em considera??o os "cases", mai?sculo e min?sculo.
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));
//		retorna verdadeiro, pois como o nome j? diz, ele ignora os cases.
		
		System.out.println(s.toLowerCase().equals("boa tarde"));
//		Uma outra forma de "escrever" o equalsIgnoreCase()
		
//		Uma vari?vel tamb?m aceita ponto, como se fosse tipo String
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
//		Situa??es de concatena??o;
		
		System.out.println("Nome: " + nome + "\n Sobrenome: " + sobrenome + "\n Idade: " + idade + "\n Salario " + salario);
		
//		N?o ? legal e chega ser cansativo sempre ficar concatenando com o "+", ent?o, existe uma outra forma de escrever sem ficar t?o cansativo.
//		Usando o String de formata??o System.out.printf(s, args);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario); //String de formata??o
		
//		Tamb?m posso fazer isso com String, usando String frase = String.format(s, args);
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		/* Formata??o de sa?da
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
