package vetores;



import java.util.Scanner;
 
public class Exercicio13 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int[] a = new int[10];
 
        System.out.println("Digite os 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
 
        boolean palindromo = false;
 
        for (int i = 0; i < 5; i++) {
        	if ( a[i]  ==  a[9 - i] ) {
            palindromo = true;
            break;
            }
 
        }
 
        if (palindromo) {
            System.out.println("É palíndromo!");
        } else {
            System.out.println("Não é palíndromo.");
        }
 
        sc.close();
    }
}
