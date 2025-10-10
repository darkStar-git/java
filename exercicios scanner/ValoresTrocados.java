package projetos01;
import java.util.Scanner;
public class ValoresTrocados {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro valor:");
		a = in.nextInt();
		System.out.println("Digite o segundo valor:");
		b = in.nextInt();
		System.out.println("Valores inseridos: " + a + " " + b);		
		c = a;
		a = b;
		b = c;
		System.out.println("Valores agora: " + a + " " + b);
	}

}
