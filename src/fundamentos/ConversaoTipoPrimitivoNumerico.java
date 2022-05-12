package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		//double a = 1; //houve uma convers�o impl�cita
		//houve uma convers�o de int para double
		//N�o h� problemas em converter int para double, mas o contr�rio pode implicar a perda de dados.
		
		//float x = 1.0F; //Preciso converter para double usando F ou Cast.
		//Convers�o usando Cast. (Convers�o expl�cita)
		
		float b = (float) 1.12345; 
		System.out.println(b);
		/*
		 * Se eu colocar mais valores, haver� perda de informa��o, pelo fato de ser
		 * float e n�o double. Por isso, o java ir� truncar o valor, deixando ele
		 * resumido.
		 */
		
//		EXEMPLO:
		
		double b1 = 1.23456788888; //Mant�m a informa��o
		System.out.println(b1);
		float b2 = (float) 1.23456788888; //trunca o valor perdendo assim informa��o.
		System.out.println(b2);
		

//		=========================================================================
		
		// O JAVA N�O ANALISA VALORES, O JAVA ANALISA TIPOS.
		
		int c = 128;
		byte d = (byte) c; //Convers�o expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
		
		
	}

}
