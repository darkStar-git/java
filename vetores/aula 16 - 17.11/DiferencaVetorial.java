package vetores;

import java.util.Scanner;

public class DiferencaVetorial {

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

		//  Diferença entre A e B
		int k = 0;

        for (i = 0; i < TAM; i++) { // percorre cada elemento de A
            boolean contem = false;

            for (int j = 0; j < TAM; j++) { // compara com todos os elementos de B
                if (a[i] == b[j]) { // se o valor de A[i] está em B
                    contem = true;
                    break; // sai do loop interno, pois já sabemos que A[i] está em B
                }
            }

            if (!contem) { // Se A[i] não estiver em B, coloca em C
                c[k] = a[i];
                k++; // incrementa o índice de C
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
			
			System.out.print("C (Diferença) = [ ");
			for(i=0; i < k; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println("]");

	}

}

