package vetSoma;

import java.util.Scanner;

public class VetSoma {

	public static void main(String[] args) {
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		int[] vetor = new int[5];
		for(int i = 0; i < vetor.length; i++ ){
			System.out.println("Digite um numeros: ");
			vetor[i] = sc.nextInt();
			soma = soma + vetor[i];
		}
		System.out.println("A soma é: " + soma);
	}

}
