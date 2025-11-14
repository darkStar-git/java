package vetores;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int TAM = 5;
        int[] A = new int[TAM];

        // Vetores
        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            A[i] = in.nextInt();
        }

        // Tabuada de cada número no vetor
        System.out.println("Tabuadas");
        for (int i = 0; i < TAM; i++) {
            System.out.println("\nTabuada do " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
        }

        in.close();
    }
}
