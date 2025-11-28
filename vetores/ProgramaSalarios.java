import java.util.*;

public class ProgramaSalarios {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[], maiorSalario=0, soma=0, position=0;
		a = new int[50];
		
		for(int i=0; i < a.length; i++) {
			System.out.print(i+1 + "º salário: ");
			a[i] = sc.nextInt();
			soma += a[i];
			
			if(a[i] > maiorSalario) {
				maiorSalario = a[i];
			}
			
			if(a[i] == maiorSalario) {
				position = i;
			}
		}
		
		System.out.println("Total: R$" + soma);
		System.out.println("Média salarial: R$" + (soma/a.length));
		System.out.println("Maior salário: R$" + maiorSalario + " | Posição: [" + position + "]");
	}
}