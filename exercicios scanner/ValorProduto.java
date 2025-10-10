package projetos01;
import java.util.Scanner;
public class ValorProduto {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		//declaração de variaveis
		Double preco, precoVenda,valorTotal,lucro;
		int quantVenda;
		System.out.println("Digite o preço do produto:");
		preco = in.nextDouble();
		System.out.println("Qual foi o valor de venda?");
		precoVenda = in.nextDouble();
		System.out.println("Quantos foram vendidos?");
		quantVenda = in.nextInt();
		valorTotal = precoVenda*quantVenda;
		lucro = (precoVenda-preco)*quantVenda;
		System.out.println("Valor total: R$" + valorTotal);
		System.out.println("Lucro: R$" + lucro);
	}

}
