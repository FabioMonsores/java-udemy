package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
//		Wrapper � uma classe que envolve um tipo primitivo
//		Para transformarmos tipo primitivo em objeto � s� escrev�-los com nome real come�ando com mai�scula
		

//		byte		
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
//		Integer i = Integer.parseInt(entrada.next()); //Converte uma String para um valor inteiro.
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString()); // Converte para String
		
		System.out.println(i*3);
		System.out.println(i/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
//		Convertendo Boolean para String e deixando tudo em mai�sculo.
		
		System.out.println(bo.toString().toUpperCase()); //Retorna TRUE, tudo em mai�sculo.
		
		Character c = '#';
		System.out.println(c + "...");
			
	}

}
