package exercicios;

public class exercicioVariavelEConstante {

	public static void main(String[] args) {
		// (�F - 32) X 5/9 = �C
		// Vari�vel para F e C
		// Constante para 32 e 5/9
				
		final double ajuste = 32; //32 � um ajuste na f�rmula
		final double fator = 5.0/9.0; // 5/9 Representa um fator multiplicativo
		
		double farenheit = 86;
		double celsius = (farenheit - ajuste) * fator;
		System.out.println("O resultado � " + celsius + "�C");
		
		farenheit = 150;
		celsius = (farenheit - ajuste) * fator;
		System.out.println("O resultado � " + celsius + "�C");
		
		farenheit = 0;
		celsius = (farenheit - ajuste) * fator;
		System.out.println("O resultado � " + celsius + "�C");				
	}
}