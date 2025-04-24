package avaliacao_parcial_01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		double preco = 0.0, soma = 0.0, desconto = 0.0;
		int qtd_produtos = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite o preço: ");
			preco = sc.nextDouble();
			soma = soma + preco;
			qtd_produtos++;
		}while(preco != 0);
		
		if(soma > 100) {
			desconto = soma * 0.10;
		}
		
		soma = soma - desconto;
		System.out.println("Total a pagar: " + soma);
		System.out.println("Quantidade de produtos: " + (qtd_produtos - 1));

	}

}
