package lista1;
import java.util.*;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numInt = in.nextInt();
		System.out.println(numInt);
		if (numInt < 0) {
			System.out.println("Negativo.");
		}
		else if (numInt == 0) {
			System.out.println("Neutro.");			
		}

		else {
			System.out.println("Positivo.");
		}
		in.close();
	}
}
