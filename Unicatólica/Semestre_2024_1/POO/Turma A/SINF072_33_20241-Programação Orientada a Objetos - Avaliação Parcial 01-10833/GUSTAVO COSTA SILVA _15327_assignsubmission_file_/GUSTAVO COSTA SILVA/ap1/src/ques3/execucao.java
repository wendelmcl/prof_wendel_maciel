package ques3;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		int mcp = 0;
		int mci =0;
		int vetor[] = {1,2,3,4,5,6,7,8,9,0};
		Scanner sc = new Scanner(System.in);
		
		
		for(int i =0;i<vetor.length;i++){
			System.out.println("Por gentileza digite um numero");
			vetor[i] = sc.nextInt();
			if(vetor[i]%2== 0){
				mcp++;
			}else{mci++;}
			
		}
		System.out.println("Dos 10 numeros que você digitou, "+mcp+" são pares e "+mci+" são impares");

	}

}
