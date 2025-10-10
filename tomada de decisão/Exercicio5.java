package lista2;
import java.util.*;
public class Exercicio5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Ano de nascimento: ");
		int anoNasc = in.nextInt();
		System.out.println("Ano atual: ");
		int anoAtual = in.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		System.out.println(idade);
		
		if (idade < 10) {
			System.out.println("Criança");
		}
		else if (idade >= 10 && idade < 18){
			System.out.println("Adolescente");
		}
		else if (idade >=18 && idade < 60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}
}