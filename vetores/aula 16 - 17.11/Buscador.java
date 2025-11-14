package vetores;

import java.util.Scanner;

public class Buscador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TAM = 10;
		int[] a = new int[TAM];
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "º número:");
			a[i] = sc.nextInt();
		}

		System.out.print("Digite o número buscado: ");
		int x = sc.nextInt();

		for (int j = 0; j < TAM; j++) { // percorre cada elemento de A
			if(a[j] == x) {
				System.out.println("Valor encontrado. Posição: "+ (a[j]) + ".");
			} 
		}

	}

}

