import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1;
		System.out.println("Insira um número e eu lhe direi a tabuada dele: ");
		int n = in.nextInt();
		
		while (i<=10) {
			System.out.println(n + "x" + i + "= " + (n * i));
			i++;
		}
	
	}

}
