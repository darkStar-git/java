package projVetores;

import java.util.Scanner;

public class somaVetores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM=10;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		//Vetor A: alimentação de dados
		for(i=0; i < TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor a" );
			a[i] = sc.nextInt();
		}
		
		//Vetor B: alimentação de dados
		for(i=0; i < TAM; i++) {
			System.out.println("Digite o"+(i+1)+" valor do vetor b" );
			b[i] = sc.nextInt();
			
			//Vetor C: soma dos vetores A e B
			c[i] = a[i]+b[i];
		}
		
		//apresentação dos valores(Vetor c)
		System.out.print("C = [ ");
		for(i=0; i < TAM; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
	}
}
