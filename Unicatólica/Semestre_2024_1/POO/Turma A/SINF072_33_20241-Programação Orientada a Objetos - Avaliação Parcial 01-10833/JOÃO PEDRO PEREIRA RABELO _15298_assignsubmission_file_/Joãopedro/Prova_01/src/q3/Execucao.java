package q3;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor [] = new int[10];
		int par = 0;
		int impar = 0;
		for(int i = 0; i < vetor.length; i++){
			System.out.println("digite um valor a ser armazenado: ");
			vetor[i] = sc.nextInt();

		}
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] % 2 == 0){
			par = par + 1;
			}else{
				impar = impar + 1;
			}
		}
		System.out.println("numeros pares: " + par);
		System.out.println("numeros impar: " + impar);
	}
}
