package vetores;

import java.util.Scanner;

public class VetoresPrimos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j;
        int cont =0;
        final int TAM = 5;
        int[] a = new int[TAM];
        
        
        //Lendo os valores
        for( i = 0; i<5; i++) {
        	System.out.println("Digite o " + (i+1) + "° numero" );
        	a[i] = in.nextInt();
        }
         //testando cada Número
        for(i=0; i<5; i++) {
        	cont = 0;
     
        	//Testando Divisores
        	for(j=1;j <=a[i]; j++) {
        		if(a[i] % j ==0) {
        		cont++;
        	}
        }
        
        //Mostrando Resultado
        if(a[i] > 1 && cont ==2) {
        	System.out.println(a[i] + " é primo");
        }else {
        	System.out.println(a[i] + " não é primo");
        }
        
        
}
    }
    }

