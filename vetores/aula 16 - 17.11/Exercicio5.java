package vetores;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int[] a = new int[TAM];

        
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            a[i] = in.nextInt();
        }
        
        
        for (int i = 0; i < TAM; i++) {
            System.out.println("Elemento A[" + i + "] = " + a[i]);
            System.out.print("Divisores: ");

            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
           System.out.println(); // 
        }
    }
}
