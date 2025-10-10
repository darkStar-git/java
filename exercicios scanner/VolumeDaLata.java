package projetos01;
import java.util.Scanner;
public class VolumeDaLata {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Double raio, altura, volume;
		System.out.println("Digite o raio:");
		raio = in.nextDouble();
		System.out.println("Digite a altura:");
		altura = in.nextDouble();
		volume = 3.14*(raio*raio)*altura;
		System.out.println("O volume da lata é de: " + volume + "cm³");
	}

}
