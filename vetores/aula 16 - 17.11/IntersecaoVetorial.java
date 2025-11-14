package vetores;

import java.util.Scanner;

public class IntersecaoVetorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final  int TAM = 10;
		int[] a = new int [TAM];
		int[] b = new int [TAM];
		int[] c = new int [TAM];
		int i =0;
		
		//Leitura dos vetores A e B
		for (i = 0; i < 10; i++) {
		    System.out.println("Digite o " + (i + 1) + "° número de A:");
		    a[i] = in.nextInt();
		}
		for (i = 0; i < 10; i++) {
		    System.out.println("Digite o " + (i + 1) + "° número de B:");
		    b[i] = in.nextInt();
		}

		//  Interseção entre A e B
		int k = 0;

		for (i = 0; i < 10; i++) {              // percorre cada elemento de A
		    for (int j = 0; j < 10; j++) {      // compara com todos os elementos de B
		        if (a[i] == b[j]) {             // se o valor de A[i] também existe em B
		            c[k] = a[i];                // guarda esse valor em C[k]
		            k++;                        // avança uma posição no vetor C
		            break;                      // sai do laço interno (pra não repetir o mesmo número)
		        }
		    }
		}

		
		   System.out.print("A = [ ");
			for(i=0; i < TAM; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.print("]");
			System.out.println(" ");
			
			
			System.out.print("b = [ ");
			for(i=0; i < TAM; i++) {
				System.out.print(b[i] + " ");
			}
			System.out.println("]");
			
			System.out.print("C (Interseção) = [ ");
			for(i=0; i < k; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println("]");

	}

}

