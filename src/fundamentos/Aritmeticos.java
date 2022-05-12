package fundamentos;

public class Aritmeticos {
	public static void main(String[] args) {

		System.out.println(2 + 3);

//		 Come�ando pelo double, podemos tanto chamar, quanto fazer a infer�ncia (var)
		var x = 34.56;
		double y = 2.2;

		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); // Divis�o inteira, valor inteiro

//		Faremos agora o int
		int a = 8;
		int b = 3;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // Divis�o inteira, valor inteiro
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
//		(double) ou (float) convertendo para double

//		OPERADOR M�DULO - Resto da divis�o
		System.out.println(a % b);
		System.out.println(8 % 3);

		System.out.println(x + y - a * b);

//		Para usarmos a pot�ncia, usamos a classe "Math.pow(a, b); Resultado de Math.pow sempre ser� em double"
//		Onde a ser� elevado pelo valor em b.

//		EXEMPLO:

		int c = 3 * 4 - 10;
		int d = (int) Math.pow(c, 3); // Valor do int c elevado a terceira pot�ncia
		double e = Math.pow(c, 3);

		System.out.println(d);
		System.out.println(e);
	}
}
