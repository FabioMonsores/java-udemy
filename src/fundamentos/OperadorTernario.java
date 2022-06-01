package fundamentos;

public class OperadorTernario {
	public static void main(String[] args) {
//		Posso colocar um operador ternário dentro do outro

		double media = 6.0;
//		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";

		String resultadoFinal = media >= 7.0 ? "aprovado" : "em recuperação";

		System.out.println("O aluno está " + resultadoFinal);

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
