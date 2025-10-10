import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 12 e eu direi o mês e quantos dias tem");
		int m = sc.nextInt();
		
		switch(m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Mês " + m + ": 31 dias.");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Mês " + m + ": 30 dias.");
				break;
			
			case 2:
				System.out.println("Fevereiro, 28 dias.");
				break;
			
			default:
				System.out.println("Mês inválido.");
		}
		
	}
}
