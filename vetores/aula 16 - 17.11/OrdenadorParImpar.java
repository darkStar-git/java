package vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a[], b[], i;
		final int TAM=10;
		a = new int[TAM];
		b = new int[TAM];
		int pos = 0;
		
		for( i = 0; i<10; i++) {
			System.out.print("Digite o " + (i+1) + "° número" );
			a[i] = in.nextInt();
		}
		
		for(i = 0; i<10;i++) {
			if(a[i] % 2 == 0) {
				b[pos] = a[i];
				pos++;
			}
		}
		
		for(i=0; i <10; i++) {
			if(a[i] % 2 !=0) {
				b[pos] = a[i];
				pos++;
			}
		}
		System.out.println("Vetor B (Pares primeiro, ímpares depois): [");
		for(i=0;i<10;i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
	}

}
