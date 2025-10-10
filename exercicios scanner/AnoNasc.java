package projetos01;
import java.util.Scanner;
public class AnoNasc {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		System.out.println("Digite seu ano de nascimento:");
		anoNasc = in.nextInt();
		System.out.println("Digite o ano atual:");
		anoAtual = in.nextInt();
		idade = anoAtual - anoNasc;
		System.out.println("Sua idade é: " + idade);
	}

}
