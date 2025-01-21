package q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[5];
		int soma;
		soma = 0;
		
		for(int i=0;i<5;i++){
			System.out.println("Digite um numero inteiro: ");
			vet[i] = sc.nextInt();
		}
		
		for(int i=0;i<5;i++){
			soma = soma + vet[i];
		}
		
		System.out.println("A soma dos elementos é: " + soma);
	}

}
