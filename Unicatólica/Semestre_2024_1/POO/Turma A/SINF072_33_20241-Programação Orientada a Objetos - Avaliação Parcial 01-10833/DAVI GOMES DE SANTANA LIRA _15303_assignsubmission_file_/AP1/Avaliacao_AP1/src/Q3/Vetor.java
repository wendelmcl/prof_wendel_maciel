package Q3;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = int[];
		int quantI = 0; 
		int quantP = 0;
		
		System.out.println("Digite 10 numeros:");
		
		for (int i = 0 ; i <= 9; i++){
			System.out.println("Numero "+(i+1)+":");
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i <=9 ; i++){
			if (vetor[i] % 2 == 0){
				quantP = quantP + 1;
			}else{
				quantI = quantI + 1;
			}
		}
		
		System.out.println("\n");
		System.out.println("Quantidade de pares: "+ quantP);
		System.out.println("Quantidade de impares: "+ quantI);
		
		sc.close();
	}

}
