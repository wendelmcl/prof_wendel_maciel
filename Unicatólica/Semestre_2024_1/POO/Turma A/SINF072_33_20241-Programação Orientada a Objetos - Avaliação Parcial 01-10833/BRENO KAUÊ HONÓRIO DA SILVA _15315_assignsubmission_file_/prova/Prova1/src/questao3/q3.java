package questao3;

import java.util.Scanner;

public class q3 {
	
			
	public static void main(String[] args) {
		int vetor[] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	for( int i = 1; i < vetor.length; i++){
		System.out.println("Digite o " + i + " número: ");
			vetor[i] = sc.nextInt();		
	}
	for( int i = 1; i < vetor.length; i++){
		System.out.println();
	}sc.close();
	
	}
	}


