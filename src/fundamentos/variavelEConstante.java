package fundamentos;

public class VariavelEConstante {
	public static void main(String[] args) {
		
		/*
		 * Definindo vari�vel
		 * tipoDaVariavel nomeDaVariavel = valorDaVariavel;
		
		 */
		
		//�rea da circunfer�ncia ( Area = PI * raio * raio)
		
		double raio = 3.4; //Vari�vel
		final double PI = 3.14159; //Constante
		double area = PI * raio * raio;

		System.out.println(area);
		
		//Atribuindo novo valor para o raio	
		//Uma vari�vel declarada, n�o precisa ser re-declarada. Sendo assim, n�o preciso chamar double e nem final double novamente, apenas usar o nome da vari�vel.
		raio = 10;
		area = PI * raio * raio;
		System.out.println("�rea = " + area + "m2");
	}

}
