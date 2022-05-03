package fundamentos;

public class NotacaoPonto {
	


	public static void main(String[] args) {
		
		//Falando sobre o uso do ponto(.) no JAVA
		//Para acessarmos um m�todo de um determinado dado e fazer uma a��o, usamos a nota��o ponto.
		
		double a = 2.3;
		String s = "Bom dia X"; //String � uma vari�vel que n�o � do tipo primitivo. Sempre com S mai�sculo.
		//Quando temos tipos que n�o s�o primitivos, temos a nossa disposi��o o ponto(.)
		
		s.toUpperCase(); //Far� minha String ser convertida totalmente para letras em mai�sculo.
		System.out.println(s.toUpperCase());
		//Se eu quiser armazenar o valor de s, uso s = s.toUperCase();
		
		s.replace("X", "Senhora"); //Substitui o primeiro valor pelo outro digitado ap�s a v�rgula.
		System.out.println(s.replace("X", "Senhora"));		
		//Se eu quiser armazenar o valor de s, uso s = s.toreplace(oldChar, newChar);
		//Onde oldChar � o caractere que quer substituir e newChar � o valor do novo caractere como visto no exemplo acima.	
		
		/*
		 * IMPORTANTE - A ordem do espa�o, influenciar� no resultado. Por exemplo:
		 * 
		 * se eu exercutar
		 * 
		 * s = stoUpperCase(s); 
		 * s = s.replace(0, 0);
		 * 
		 * O programa ir� ler na sequ�ncia digitada, n�o transformando os caracteres de
		 * s.replace(0, 0) em mai�scula. Agora se eu inverter:
		 * 
		 * s = s.replace(0, 0); 
		 * s = stoUpperCase(s);
		 * 
		 * s.replace(0, 0), ter� seus caracteres em mai�sculo.
		 * 
		 * Isso � o que dizer que a ordem do espa�o influencia no resultado.
		 */
		System.out.println("");
		System.out.println("Exemplo de Ordem de Espa�o");
		
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
		
//		Mesmo n�o armazenando na vari�vel, tamb�m podemos chamar uma string pelo System.out.println();
		
		System.out.println("F�bio".toUpperCase());
//		Tamb�m podemos fazer de forma armazenada.
		
		String X = "F�bio".toUpperCase(); 
		System.out.println(X);
		
//		Como JAVA � uma senten�a de linhas, podemos quebrar linhas antes ou depois do ponto.
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(y);
		
//		Funciona apenas caso a fun��o seja para String, caso eu coloque uma fun��o para inteiro .length(), a concate��o para.. Pois toUpperCase() n�o existe para os inteiros, e quebra a sequ�ncia l�gica.
		
//		IMPORTANTE - N�o posso usar sempre o ponto, pois ele n�o est� presente em todos os cen�rios, pois n�o � um tipo primitivo.
//		 A �nica coisa que um tipo primitivo tem � o valor, a �nica coisa que ele armazena � o pr�prio valor
//		Tanto que se eu usar ----- a = 2; a. ele n�o informar� nada.
		
	}

}
