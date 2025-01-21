package Questão03;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[10];
		Scanner sc = new Scanner(System.in);
		int par = 0;
		int impar = 0; 
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Vetor ["+ (i + 1) +"]: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("Numeros pares: ");
		for (int i = 0; i < vetor.length; i ++) {
			if(vetor[i] % 2 == 0) {
				System.out.println(vetor[i] + " :" + " par" );
			}
		}
		System.out.println("A quantidade de numeros pares sera: " + par);
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		System.out.println("Numeros impares: ");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 != 0) {
				System.out.println(vetor[i] + " :" + " impar");
			}
		}
		
		System.out.println("A quantidade de numeros impares sera: " + impar);

	}

}
