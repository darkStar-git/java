package projVetores;

import java.util.Scanner;

public class VetorMediano {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], b;
		final int TAM=10;
		a = new int[TAM];
		b = 0;
		
		for(int i=0; i < TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor do vetor a" );
			a[i] = sc.nextInt();
			
			b += a[i];
		}
		
		//apresentação
		System.out.println("Média dos valores: [" + b/TAM + "]");
	}
}
