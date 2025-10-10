import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número final da sua placa e eu direi seu dia de rodízio");
		int digitoPlaca = sc.nextInt();
		
		switch(digitoPlaca) {
		case 1:
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
		case 4:
			System.out.println("Terça-feira");
			break;
			
		case 5:
		case 6:
			System.out.println("Quarta-feira");
			break;
			
		case 7:
		case 8:
			System.out.println("Quinta-feira");
			break;
			
		default:
			System.out.println("Sexta-feira");
		}
	}
}
