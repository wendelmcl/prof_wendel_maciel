package q1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int mcp = 0;
		int mci = 0;
		int Vetor [] = {1,2,3,4,5,6,7,8,9,0};
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i<Vetor.length; i++) {
			System.out.println("Por gentileza digite um número");
			Vetor[i] = sc.nextInt();
			if(Vetor [i]%2== 0){
			   mcp++; 
		   }else{mci++;}
			}
			System.out.println("Dos 10 Números que você digitou, "+mcp+" são pares e "+mci+" são impares!");
		}
}


