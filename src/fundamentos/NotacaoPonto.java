package fundamentos;

public class NotacaoPonto {
	


	public static void main(String[] args) {
		
		//Falando sobre o uso do ponto(.) no JAVA
		//Para acessarmos um método de um determinado dado e fazer uma ação, usamos a notação ponto.
		
		double a = 2.3;
		String s = "Bom dia X"; //String é uma variável que não é do tipo primitivo. Sempre com S maiúsculo.
		//Quando temos tipos que não são primitivos, temos a nossa disposição o ponto(.)
		
		s.toUpperCase(); //Fará minha String ser convertida totalmente para letras em maiúsculo.
		System.out.println(s.toUpperCase());
		//Se eu quiser armazenar o valor de s, uso s = s.toUperCase();
		
		s.replace("X", "Senhora"); //Substitui o primeiro valor pelo outro digitado após a vírgula.
		System.out.println(s.replace("X", "Senhora"));		
		//Se eu quiser armazenar o valor de s, uso s = s.toreplace(oldChar, newChar);
		//Onde oldChar é o caractere que quer substituir e newChar é o valor do novo caractere como visto no exemplo acima.	
		
		/*
		 * IMPORTANTE - A ordem do espaço, influenciará no resultado. Por exemplo:
		 * 
		 * se eu exercutar
		 * 
		 * s = stoUpperCase(s); 
		 * s = s.replace(0, 0);
		 * 
		 * O programa irá ler na sequência digitada, não transformando os caracteres de
		 * s.replace(0, 0) em maiúscula. Agora se eu inverter:
		 * 
		 * s = s.replace(0, 0); 
		 * s = stoUpperCase(s);
		 * 
		 * s.replace(0, 0), terá seus caracteres em maiúsculo.
		 * 
		 * Isso é o que dizer que a ordem do espaço influencia no resultado.
		 */
		System.out.println("");
		System.out.println("Exemplo de Ordem de Espaço");
		
		s = s.toUpperCase();
		s = s.replace("X", "Senhora");
		System.out.println(s);
				
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		System.out.println(s);
		
//		Temo uma forma de concatenar uma String com s.concat();
		
		s.concat("!!!");
		System.out.println(s.concat("!!!"));
		
		// ou
		
		s = s.concat("!!!!");
		System.out.println(s);
		
//		Mesmo não armazenando na variável, também podemos chamar uma string pelo System.out.println();
		
		System.out.println("Fábio".toUpperCase());
//		Também podemos fazer de forma armazenada.
		
		String X = "Fábio".toUpperCase(); 
		System.out.println(X);
		
//		Como JAVA é uma sentença de linhas, podemos quebrar linhas antes ou depois do ponto.
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
//		Funciona apenas caso a função seja para String, caso eu coloque uma função para inteiro .length(), a concateção para.. Pois toUpperCase() não existe para os inteiros, e quebra a sequência lógica.
		
//		IMPORTANTE - Não posso usar sempre o ponto, pois ele não está presente em todos os cenários, pois não é um tipo primitivo.
//		 A única coisa que um tipo primitivo tem é o valor, a única coisa que ele armazena é o próprio valor
//		Tanto que se eu usar ----- a = 2; a. ele não informará nada.
		
	}

}
