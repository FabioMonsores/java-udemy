package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
//		Wrapper é uma classe que envolve um tipo primitivo
//		Para transformarmos tipo primitivo em objeto é só escrevê-los com nome real começando com maiúscula
		

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
		
//		Convertendo Boolean para String e deixando tudo em maiúsculo.
		
		System.out.println(bo.toString().toUpperCase()); //Retorna TRUE, tudo em maiúsculo.
		
		Character c = '#';
		System.out.println(c + "...");
			
	}

}
