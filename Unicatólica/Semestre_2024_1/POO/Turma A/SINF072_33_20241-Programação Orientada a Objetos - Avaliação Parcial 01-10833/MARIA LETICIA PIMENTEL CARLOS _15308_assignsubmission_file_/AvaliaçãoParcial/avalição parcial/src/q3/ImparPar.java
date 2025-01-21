package q3;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int[] vetor = new int[10];
		int impar = 0;
		int par = 0;
		
		for(int i = 0; i < vetor.length; i++){
			
		System.out.println("Digite um valor para o vetor["+i+"] :");
		vetor[i] = sc.nextInt();	
		
		
		}
		
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] % 2 == 0){
			 
				par= par + 1;
				
			}
			else {
				impar = impar + 1;
			}
					
	}
		
		System.out.println("QUANTIDADE DE NÚMERO ÍMPARES NO VETOR : " + impar );
		System.out.println("QUANTIDADE DE NÚMERO PARES NO VETOR : " + par);

		
		

	}

}
