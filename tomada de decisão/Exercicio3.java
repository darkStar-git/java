package lista1;
import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt();
		
		if (numero %2==0) {
			System.out.println("Número par.");
		}
		else {
			System.out.println("Número ímpar.");
		}
	}
}
