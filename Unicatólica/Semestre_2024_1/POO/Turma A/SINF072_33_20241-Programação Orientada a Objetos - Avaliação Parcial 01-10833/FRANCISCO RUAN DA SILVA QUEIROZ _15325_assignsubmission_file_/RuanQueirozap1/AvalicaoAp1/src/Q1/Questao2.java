package Q1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os 5 valores inteiros para o vetor");
		int vetor1 = (int) sc.nextInt();	
		int vetor2 = (int) sc.nextInt();
		int vetor3 = (int) sc.nextInt();
		int vetor4 = (int) sc.nextInt();
		int vetor5 = (int) sc.nextInt();
		
		int soma = vetor1 + vetor2 + vetor3 + vetor4 + vetor5;
		
		if(vetor1+vetor2+vetor3+vetor4+vetor5 == soma);
		System.out.println("Essa é a soma dos vetores:" + soma );
		
	}
}