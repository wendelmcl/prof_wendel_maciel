package questao3;

import java.util.Scanner;

public class VetParImpar {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int par = 0; int impar = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite o " + (i+1) +"º número do vetor : ");
			vetor[i] = sc.nextInt();
			if(vetor[i]%2==0){
				par++;
			}else{
				impar++;
			}
		}
			
		System.out.print("\nNúmeros Pares : ");
		for (int i = 0; i<vetor.length; i++){
			if(vetor[i]%2==0){
				System.out.print(vetor[i] + " ");
			}
		}System.out.println("\nQuantidade de números Pares : "+ par);
			
			System.out.print("\nNúmeros Ímpares : ");
			for (int i = 0; i<vetor.length; i++){
				if(vetor[i]%2==1){
					System.out.print(vetor[i] + " ");
					
				}
			}System.out.println("\nQuantidade de números Ímpares : "+ impar);
			sc.close();
		  }	
		}
