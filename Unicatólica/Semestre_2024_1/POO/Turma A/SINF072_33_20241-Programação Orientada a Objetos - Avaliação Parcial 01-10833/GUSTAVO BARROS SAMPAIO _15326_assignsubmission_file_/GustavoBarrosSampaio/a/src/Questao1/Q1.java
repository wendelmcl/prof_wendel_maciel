package Questao1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		//Quest�o n�o resolvida

		Scanner entrada = new Scanner(System.in);

		String numero = "";

		System.out.println("Digite um n�mero: ");
		int n = entrada.nextInt();

		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 1; i < vetor.length; i++) {
			if (n % vetor[i] != 1) {
				if (n / vetor[i] > 1) {
					numero = "N�mero n�o primo!";
				} else {
					numero = "N�mero primo!";
				}

			}

		}
		System.out.println(numero);
		entrada.close();
	}
}
