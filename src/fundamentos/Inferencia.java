package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		//� poss�vel voc� n�o informar o tipo de vari�vel e colocar um "var"
		// O java ir� inferir pelo valor da vari�vel o tipo da vari�vel
		
		var b = 4.5;
		System.out.println(b);
		
		var c ="Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		/*
		 * O que n�o pode acontecer quando se tem uma infer�ncia? O que n�o pode
		 * acontecer � voc� pegar uma vari�vel C e declarar sem antes dizer qual o tipo dela. 
		 * c = 4.5
		 * O java nunca ir� permitir.
		 * As vari�veis em java sempre s�o de um determinado tipo e esse tipo nunca vai mudar.
		 * Posso tamb�m definir uma vari�vel em uma linha e inici�-la em outra
		 */			
		
		double d; //Vari�vel foi declarada
		d = 123.65; // Vari�vel foi inializada
		System.out.println(d); //Vari�vel foi usada
		
		//N�o consigo fazer isso usando o "var", dessa forma, assim que eu declarar a vari�vel, eu j� devo iniciar a mesma
		// Porque � a partir da inicializa��o que o JAVA consegue inferir qual � o tipo de dado associado aquela vari�vel.
	}
}
