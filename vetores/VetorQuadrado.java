package projVetores;

import java.util.Scanner;

public class VetorQuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], i;
		final int TAM=5;
		a = new int[TAM];
		b = new int[TAM];
		
		//Vetor a: alimentação de dados
		for(i=0; i < TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor a" );
			a[i] = sc.nextInt();
			
		}
		System.out.print("B = [ ");
		for(i=TAM-1; i < TAM && i >= 0; i--) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}
}
