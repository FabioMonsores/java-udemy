package fundamentos;

public class VariavelEConstante {
	public static void main(String[] args) {
		
		/*
		 * Definindo variável
		 * tipoDaVariavel nomeDaVariavel = valorDaVariavel;
		
		 */
		
		//Área da circunferência ( Area = PI * raio * raio)
		
		double raio = 3.4; //Variável
		final double PI = 3.14159; //Constante
		double area = PI * raio * raio;

		System.out.println(area);
		
		//Atribuindo novo valor para o raio	
		//Uma variável declarada, não precisa ser re-declarada. Sendo assim, não preciso chamar double e nem final double novamente, apenas usar o nome da variável.
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2");
	}

}
