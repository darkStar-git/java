package projetos01;
import java.util.Scanner;
public class CalculoImc {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Double peso, altura, imc;
		System.out.println("Diga-me seu peso:");
		peso = in.nextDouble();
		System.out.println("Diga-me sua altura:");
		altura = in.nextDouble();
		imc = peso/(altura*altura);
		System.out.println("Seu IMC é: " + imc);
	}

}
