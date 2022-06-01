package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {

		int a = 1;
		int b = 2;

//		FORMA P�S-FIXADA
//		Colocar o operador ap�s o operando

//		Incrementar
		a++; // a = a + 1;

//		Decrementar
		a--; // a = a - 1;

//		FORMA PR�-FIXADA
//		Colocar o operador antes do operando

//		Icrementar
		++b; // b = b + 1;

//		Decrementar
		--b; // b = b - 1;

		System.out.println(a);
		System.out.println(b);

		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); // ++a tem preced�ncia frente a b--
		System.out.println(a);
		System.out.println(b);
	}
}
