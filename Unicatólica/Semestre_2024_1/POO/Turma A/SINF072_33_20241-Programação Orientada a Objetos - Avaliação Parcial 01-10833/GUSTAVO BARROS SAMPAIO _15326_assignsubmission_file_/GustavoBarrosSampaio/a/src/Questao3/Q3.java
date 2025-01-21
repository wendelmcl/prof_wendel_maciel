package Questao3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int par = 0;
		int impar = 0;

		int[] vetor = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = entrada.nextInt();
			if (vetor[i] % 2 == 0) {
				par += 1;
			} else {
				impar += 1;
			}

		}
		
		System.out.println("Nesse vetor existem " + impar + " números impares!");
		System.out.println("Nesse vetor existem " + par + " números pares!");
		
		entrada.close();
	}

}
