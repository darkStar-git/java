import java.util.Scanner;

public class NumeroExpoente {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("DIGITE A BASE:");
        int base = sc.nextInt();
        System.out.println("DIGITE O EXPOENTE:");
        int expoente = sc.nextInt();
        int resultado = 1;
        int i = 0;

        do {
            resultado *= base;
            i++;
        } while (i < expoente);

        System.out.println(base + " elevado a " + expoente + " é: " + resultado);
    }
}