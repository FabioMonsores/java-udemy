package fundamentos;

import java.util.Date;

//import javax.swing.JButton;

//import fica fora da classe

public class Import {
	public static void main(String[] args) {
		String s = "Bom dia";
		System.out.println(s);
		
//		Nem tudo est� 100% dispon�vel em nosso c�digo		
//		O JAVA tem uma s�rie de funcionalidades
//		O JAVA j� vem com uma biblioteca b�sica pr�-instalada, o que me permiti usar String sem problemas
				
		//Entretando se eu usar um Date(), terei de importa-lo
		
		Date d = new Date(); // Existem mais de um Date() na API do java para importa��o
		System.out.println(d);
		
//		JButton botao = new JButton(); //Existe apenas um button para importa��o na API do java

		java.lang.String b = "Boa tarde"; // Caminho completo da string dentro do JAVA
		java.lang.System.out.println(b);
//		Serve para mostrar que j� temos um pacote b�sico dispon�vel.
	
		
		
	}
}
