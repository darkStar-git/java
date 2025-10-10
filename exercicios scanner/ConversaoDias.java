package projetos01;
import java.util.Scanner;
public class ConversaoDias {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int dias, meses, anos;
		System.out.println("Diga a quantidade de dias:");
		dias= in.nextInt();
		meses = dias/30;
		System.out.println("Quantidade em meses: " + meses);
		anos = dias/365;
		System.out.println("Quantidade em anos: " + anos);
	}

}
