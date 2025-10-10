import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maiorDe50 = 0, entre10e20 = 0, maiorIdade = 0, menorIdade = 0;
		double somaAlturas = 0, mediaPeso = 0;
		
		for(int i = 1; i<= 5; i++) {
			System.out.println("Pessoa "+i+":");

			System.out.println("Idade:");
			int idade = sc.nextInt();
			
			System.out.println("Altura:");
			double altura = sc.nextDouble();
			
			System.out.println("Idade:");
			double peso = sc.nextDouble();
			
			maiorIdade = idade;
			menorIdade = idade;
			
			if (idade > 50) {
				maiorDe50 ++;
			}
			else {
				if (idade >=10 && idade <=20) {
					somaAlturas += altura;
					entre10e20++;
				}
			}
			
			if (peso < 40) {
				mediaPeso++;
			}
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
			} else {
				if (idade < menorIdade) {
					menorIdade = idade;
				}
			}
			
		}
		
		System.out.println("Pessoa mais velha: "+maiorIdade+"anos. Pessoa mais nova: "+menorIdade+"anos.");
		System.out.println("Porcentagem de pessoas com menos de 40kg: " + (mediaPeso/5)*100 +"%");
		System.out.println("Média das alturas de pessoas entre 10 e 20 anos: " + somaAlturas/entre10e20);
	}

}
