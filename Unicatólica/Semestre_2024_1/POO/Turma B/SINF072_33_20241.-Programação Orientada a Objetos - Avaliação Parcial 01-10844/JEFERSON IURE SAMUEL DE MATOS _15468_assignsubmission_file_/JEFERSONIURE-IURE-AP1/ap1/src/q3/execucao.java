package q3;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[5];
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.println("Digite 5 numeros inteiros: ");
		for (int i = 0;i < vetor.length; i++) {
			System.out.println("Digite um numeros ");
			vetor[i] = sc.nextInt();
			
			soma = soma + vetor[i];
		}
		System.out.println("A soma dos 5 vetores é: " + soma);
		

		
		

	}

}
