package fundamentos;

import java.util.Date;

//import javax.swing.JButton;

//import fica fora da classe

public class Import {
	public static void main(String[] args) {
		String s = "Bom dia";
		System.out.println(s);
		
//		Nem tudo está 100% disponível em nosso código		
//		O JAVA tem uma série de funcionalidades
//		O JAVA já vem com uma biblioteca básica pré-instalada, o que me permiti usar String sem problemas
				
		//Entretando se eu usar um Date(), terei de importa-lo
		
		Date d = new Date(); // Existem mais de um Date() na API do java para importação
		System.out.println(d);
		
//		JButton botao = new JButton(); //Existe apenas um button para importação na API do java

		java.lang.String b = "Boa tarde"; // Caminho completo da string dentro do JAVA
		java.lang.System.out.println(b);
//		Serve para mostrar que já temos um pacote básico disponível.
	
		
		
	}
}
