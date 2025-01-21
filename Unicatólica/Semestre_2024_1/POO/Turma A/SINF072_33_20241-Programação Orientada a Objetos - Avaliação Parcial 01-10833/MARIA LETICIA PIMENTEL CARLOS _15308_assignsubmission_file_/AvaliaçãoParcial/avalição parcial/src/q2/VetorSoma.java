package q2;

import java.util.Scanner;

public class VetorSoma {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 int total = 0;
	
		int[] vetor = new int[5];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor para o vetor["+i+"] :");
			vetor[i] = sc.nextInt();
			total = total + vetor[i];
		}
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor["+i+"] é "+vetor[i]);
		}
		System.out.println("\nSoma total dos elementos: " + total);	
		

	}

}
