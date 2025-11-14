package vetores;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		int[] a = new int [TAM];
		int[] b = new int [TAM];
		int i = 0;
		// 1Leitura de todos os valores do vetor A
		for (i = 0; i < 10; i++) {
		    System.out.println("Digite o " + (i + 1) + "° número:");
		    a[i] = in.nextInt();
		}

		// Cálculo do somatório (de A[i] até o final)
		for (i = 0; i < 10; i++) {
		    int soma = 0;
		    for (int j = i; j < 10; j++) { 
		        soma = soma + a[j];
		    }
		    b[i] = soma;
		}

		
        System.out.print("A = [ ");
		for(i=0; i < TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		System.out.println(" ");
		
		
		System.out.print("b (Soma de A) = [ ");
		for(i=0; i < TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("]");



	}

}
