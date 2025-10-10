package projetos01;
import java.util.Scanner;
public class ArestaDocubo {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Double aresta, volume;
		System.out.println("Digite o tamanho da aresta:");
		aresta= in.nextDouble();
		volume = (aresta*aresta)*aresta;
		System.out.println("O volume do cubo é de: " + volume);
	}

}
