package vetores;

import java.util.Scanner;

public class PotenciasDe2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i =0;
		final int TAM = 11;
		int[] a = new int [TAM];
		int pot = 1;
		
		for(i=0;i<TAM;i++) {
			a[i] = pot;
			pot = pot*2;
		}
		System.out.println("Potências de 2 (de 2^0 a 2^10):");
		for(i=0;i<TAM;i++) {
			System.out.println("A[" + i + "] = " + a[i]);
		}

	}

}

