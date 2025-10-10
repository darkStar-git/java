package lista1;
import java.util.*;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		int fh = sc.nextInt();
		
		int celsius = ((fh-32)*5)/9;
		
		System.out.println(celsius + "°C");
		
		if (celsius < 0) {
			System.out.println("Frio extremo");
		}
		else if(celsius == 0 && celsius < 10) {
			System.out.println("Frio");
		}
		else if(celsius > 10 && celsius < 20) {
			System.out.println("Frio moderado");
		}
		else if(celsius >= 20 && celsius <= 24) {
			System.out.println("Clima ameno");
		}
		else {
			System.out.println("Calor");
		}
		sc.close();
	}
}
