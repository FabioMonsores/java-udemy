package fundamentos;

public class OperadoresAtribuicao {

	public static void main(String[] args) {

//		São operadores que também usam dois operandos

		int a = 3;
		int b = a;
		int c = a + b;
		System.out.println(c);
		
//		c = c + b;
// 		Forma mais simplificada da esquação acima.
		c += b; // c = c + b; 
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		c /= a; // c = c / a;
		
		c %= 2; // c = c % 2; 0 ou 1, se 0 quer dizer par, se 1 quer dizer ímpar.		
		System.out.println(c);
	

	}
}
