package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
//		Posso colocar um operador tern�rio dentro do outro

		double media = 6.0;
//		String resultadoParcial = media >= 5.0 ? "em recupera��o" : "reprovado";

		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recupera��o";

		System.out.println("O aluno est� " + resultadoFinal);

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
