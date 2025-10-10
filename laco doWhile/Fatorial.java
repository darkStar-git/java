import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int n = sc.nextInt();
		int i = n-1;
		int fatorial = n;
		
		do {
			fatorial = fatorial*i; 
			System.out.println(fatorial);
			i--;
		} while (i>0);
		System.out.println(n + "!=" + fatorial);
	}
}

