package revisao;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int valor, contador = 0, soma = 0;
		double media = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		valor = sc.nextInt();
		while(valor != 0) {
			contador++;
			soma = soma + valor;
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
		}
		System.out.println("Quantidade de números: " + contador);
		System.out.println("Soma: " + soma);
		media = soma / contador;
		System.out.println("Média: " + media);
	}
}
