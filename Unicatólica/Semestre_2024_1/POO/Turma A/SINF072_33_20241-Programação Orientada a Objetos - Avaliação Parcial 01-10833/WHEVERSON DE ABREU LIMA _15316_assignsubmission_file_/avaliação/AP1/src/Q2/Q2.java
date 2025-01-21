package Q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];
		int soma;
		
		for ( int i = 0; i < 4; i++){
			System.out.println("Digite um numero para o vetor");
			vetor[i] = sc.nextInt();
		}
		soma =  vetor[4];
		
		System.out.println("Soma dos números é: " + soma);
		

	}

}
