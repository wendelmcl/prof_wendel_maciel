package Questao2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		
		int [] vetor = new int[5];
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite o número: " + (i + 1));
			vetor[i] = entrada.nextInt();
			soma += vetor[i];
			
			
		}
		
		System.out.println(soma);
		entrada.close();
	}
}
