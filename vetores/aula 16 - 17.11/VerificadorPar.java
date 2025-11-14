package vetores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i;
		int j = 0;
		final int TAM = 10;
		int[]a = new int[TAM];
		
		
		 for ( i = 0; i < TAM; i++) {
	            System.out.print("Digite o " + (i + 1) + "° número: ");
	            a[i] = in.nextInt();
	        }
		for (i = 0; i < TAM; i++) {
            System.out.println(" A[" + i + "] = " + a[i]);
            System.out.print("Pares de 0 até " + a[i] + ": ");

            for ( j = 0; j <= a[i]; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println(); 
			}
		}
	}


