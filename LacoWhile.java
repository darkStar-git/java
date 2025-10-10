import java.util.Scanner;

public class LacoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite o ano de início:");
		 int anoInicial = sc.nextInt();
		  
		 System.out.println("Digite o ano Alvo:");
		 int anoAlvo = sc.nextInt();
		 
		 System.out.println("Anos bissextos entre "+ anoInicial + " e " + anoAlvo);
		 
		 int anoAtual = anoInicial;
		 
		 while (anoAtual <= anoAlvo) {
			 if(anoAtual % 4 == 0) {
				 System.out.println(anoAtual);
			 }
			 anoAtual++;
		 }
	}
}

