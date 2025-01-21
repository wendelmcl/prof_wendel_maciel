package Q3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int somaI, somaP;
		somaI = 0;
		somaP = 0;
		
		int vet[] = new int[10];
		
		for(int i = 0;i <10;i++){
			System.out.println("Digite um número inteiro: ");
			vet[i] = sc.nextInt();
		}
		
		for(int i = 0;i <10;i++){
			if(vet[i]%2 == 0){
				somaP++;
			}else{
				somaI++;
			}
		}
		System.out.println("Total de números pares: " + somaP);
		System.out.println("Total de números impares: " + somaI);
	}

}
