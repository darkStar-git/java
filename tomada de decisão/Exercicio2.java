package lista1;
import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ano de nascimento: ");
		int anoNasc = in.nextInt();
		System.out.println("Ano atual: ");
		int anoAtual = in.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		System.out.println(idade);
		
		if (idade < 17) {
			System.out.println("Menor de idade");
		}
		else {
			System.out.println("Maior de idade");
		}
	}
}
