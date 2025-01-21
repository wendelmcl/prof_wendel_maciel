package Questão02;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[5];
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		System.out.println("Digite 5 numeros inteiros: ");
		for (int i = 0;i < vetor.length; i++) {
			vetor[i] = sc.nextInt();
			soma = soma + vetor[i];
		}
		System.out.println("A soma dos 5 vetores é: " + soma);
		

	}

}
