import java.util.Scanner;

public class SequenciaDeFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.println("Digite a quantidade de termos a serem sequenciados");
		int q = sc.nextInt();
		 int t1 = 0;
	     int t2 = 1;
	     int prox = 0;
		
		   do {
	            prox = t1 + t2;
	            t1 = t2;
	            t2 = prox;
	            System.out.println(prox);
	            i++;
	        } while (i <= q);
	}
}
