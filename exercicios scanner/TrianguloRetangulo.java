package projetos01;
import java.util.Scanner;
public class TrianguloRetangulo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Double base, altura, area;
		System.out.println("Digite a base:");
		base = in.nextDouble();
		System.out.println("Digite a altura:");
		altura = in.nextDouble();
		area = (base*altura)/2;
		System.out.println("A área do triângulo é: " + area);
	}

}
