import java.util.Scanner;

public class LacoDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int resposta, anoAtual, anoNasc, idade;
		do {
			
			System.out.println("Ano atual: ");
			anoAtual = sc.nextInt();
			System.out.println("Ano de nascimento");
			anoNasc = sc.nextInt();
			
			idade = anoAtual - anoNasc;
			
			System.out.println("Sua idade é: " + idade);
			System.out.println("Deseja continuar? 1 – continuar / 0 – sair");
			resposta = sc.nextInt();
			
		} while (resposta != 0);
	}
}

