package projetos01;
import java.util.Scanner;
public class SalarioLiquido {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		Double inss, salario, valeTransp, salarioLiquido, desconto;
		System.out.println("Digite seu salário:");
		salario = in.nextDouble();
		inss = salario*0.08;
		valeTransp = salario*0.06;
		desconto = inss + valeTransp;
		salarioLiquido = salario - (inss+valeTransp);
		System.out.println("Total descontado: " + desconto);
		System.out.println("Salário bruto: R$" + salario);
		System.out.println("Seu salário real é de R$" + salarioLiquido);
	}

}
