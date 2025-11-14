package vetores;

import java.util.Scanner;

public class VerificadorDeImpares {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
 
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor A[" + i + "]: ");
            A[i] = sc.nextInt();
 
            if (A[i] % 2 == 0) {
                B[i] = 1; // par
            } else {
                B[i] = 0; // ímpar
            }
        }
        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
 
        sc.close();
    }

}
