package questao3;

import java.util.Scanner;

public class VetParImpar {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int par = 0; int impar = 0;
		
		for(int i = 0; i < 10; i++){
			System.out.print("Digite o " + (i+1) +"� n�mero do vetor : ");
			vetor[i] = sc.nextInt();
			if(vetor[i]%2==0){
				par++;
			}else{
				impar++;
			}
		}
			
		System.out.print("\nN�meros Pares : ");
		for (int i = 0; i<vetor.length; i++){
			if(vetor[i]%2==0){
				System.out.print(vetor[i] + " ");
			}
		}System.out.println("\nQuantidade de n�meros Pares : "+ par);
			
			System.out.print("\nN�meros �mpares : ");
			for (int i = 0; i<vetor.length; i++){
				if(vetor[i]%2==1){
					System.out.print(vetor[i] + " ");
					
				}
			}System.out.println("\nQuantidade de n�meros �mpares : "+ impar);
			sc.close();
		  }	
		}
