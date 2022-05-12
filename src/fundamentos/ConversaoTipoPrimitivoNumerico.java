package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//double a = 1; //houve uma conversão implícita
		//houve uma conversão de int para double
		//Não há problemas em converter int para double, mas o contrário pode implicar a perda de dados.
		
		//float x = 1.0F; //Preciso converter para double usando F ou Cast.
		//Conversão usando Cast. (Conversão explícita)
		
		float b = (float) 1.12345; 
		System.out.println(b);
		/*
		 * Se eu colocar mais valores, haverá perda de informação, pelo fato de ser
		 * float e não double. Por isso, o java irá truncar o valor, deixando ele
		 * resumido.
		 */
		
//		EXEMPLO:
		
		double b1 = 1.23456788888; //Mantém a informação
		System.out.println(b1);
		float b2 = (float) 1.23456788888; //trunca o valor perdendo assim informação.
		System.out.println(b2);
		

//		=========================================================================
		
		// O JAVA NÃO ANALISA VALORES, O JAVA ANALISA TIPOS.
		
		int c = 128;
		byte d = (byte) c; //Conversão explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
		
		
	}

}
