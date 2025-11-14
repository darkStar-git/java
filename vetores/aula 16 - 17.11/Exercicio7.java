package vetores;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner  in = new Scanner(System.in);
		int i = 0;
		final int TAM = 15;
		int[] a = new int[TAM];
		int[] b = new int[TAM];
		
		for (i = 0; i < TAM; i++) {
		    System.out.println("Digite o " + (i + 1) + "° número:");
		    a[i] = in.nextInt();

		    int fat = 1; 
		    for (int j = 1; j <= a[i]; j++) {
		        fat = fat * j; // multiplica de 1 até o valor de A[i]
		    }
		    b[i] = fat;
		}
    
        System.out.print("A = [ ");
		for(i=0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println(" ");
		
		
		System.out.print("b (Fatorial) = [ ");
		for(i=0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");
		
	}
	}


