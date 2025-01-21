package ques2;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		
		
		for(int i =0;i<vetor.length;i++){
			System.out.println("Por gentileza digite um numero");
			vetor[i] = sc.nextInt();
		}
		System.out.println(vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4]);
	}

}
