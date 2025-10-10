package projetos01;
import java.util.Scanner;
public class CalculaMedia {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite a primeira nota:");
		nota1 = in.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = in.nextDouble();
		media = (nota1+nota2)/2;
		if (media >= 6) {
			System.out.println("Sua média é: " + media + ". Parabéns, você passou!");
		}
		else {
			System.out.println("Sua média é: " + media + ". Infelizmente, você reprovou.");
		}
	}
}
