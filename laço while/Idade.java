import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idd, maior=0, menor= 0;
		int i=1;
		
		
		while (i<=5) {
			System.out.println("Digite a idade da " + i + "ª pessoa: ");
			idd = sc.nextInt();
			if (idd <= 18) {
				menor += 1;
			}
			else {
				maior += 1;
			}
			i++;
		}
		System.out.println("Menores de idade: " + menor + ". Maiores de idade: " + maior + ".");
		sc.close();
	}

}
