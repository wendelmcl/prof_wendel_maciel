package Questao02;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
	int vetor[] = new int[5]; 
	int i = 0, soma =0;
	
	Scanner leitor = new Scanner(System.in);
	
	while (i < 5) {
		System.out.print("Insira um número inteiro!");
		vetor[i] = leitor.nextInt();
		soma += vetor[i];
		i = i + 1;
	}
	
	System.out.print("O resultado total da soma é: " + soma);
	leitor.close();
	}

}
