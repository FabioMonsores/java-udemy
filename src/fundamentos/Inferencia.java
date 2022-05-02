package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		//É possível você não informar o tipo de variável e colocar um "var"
		// O java irá inferir pelo valor da variável o tipo da variável
		
		var b = 4.5;
		System.out.println(b);
		
		var c ="Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		/*
		 * O que não pode acontecer quando se tem uma inferência? O que não pode
		 * acontecer é você pegar uma variável C e declarar sem antes dizer qual o tipo dela. 
		 * c = 4.5
		 * O java nunca irá permitir.
		 * As variáveis em java sempre são de um determinado tipo e esse tipo nunca vai mudar.
		 * Posso também definir uma variável em uma linha e iniciá-la em outra
		 */			
		
		double d; //Variável foi declarada
		d = 123.65; // Variável foi inializada
		System.out.println(d); //Variável foi usada
		
		//Não consigo fazer isso usando o "var", dessa forma, assim que eu declarar a variável, eu já devo iniciar a mesma
		// Porque é a partir da inicialização que o JAVA consegue inferir qual é o tipo de dado associado aquela variável.
	}
}
