package fundamentos;

public class OperadoresAtribuicao {

	public static void main(String[] args) {

//		S�o operadores que tamb�m usam dois operandos

		int a = 3;
		int b = a;
		int c = a + b;
		System.out.println(c);
		
//		c = c + b;
// 		Forma mais simplificada da esqua��o acima.
		c += b; // c = c + b; 
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		
		c %= 2; // c = c % 2; 0 ou 1, se 0 quer dizer par, se 1 quer dizer �mpar.		
		System.out.println(c);
	

	}
}
