package projVetores;

import java.util.Scanner;

public class VetorInvertido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], i;
		final int TAM=10;
		a = new int[TAM];
		b = new int[TAM];
		
		//Vetor a: alimentação de dados
		for(i=0; i < TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor a" );
			a[i] = sc.nextInt();
			//implementação do vetor B
			b[i] = a[i]*a[i];
		}
		System.out.print("B = [ ");
		for(i=0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}
}
