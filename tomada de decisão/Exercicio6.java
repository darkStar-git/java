package lista2;
import java.util.*;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Distância percorrida(em Km): ");
		int kmPerco = sc.nextInt();
		
		System.out.println("Capacidade do tanque(em Litros): ");
		int tanque = sc.nextInt();
		
		int gasto = kmPerco / tanque;
		
		System.out.println(gasto);
		
		if (gasto >= 10) {
			System.out.println("Econômico");
		}
		else {
			System.out.println("Não econômico");
		}
	}
}
