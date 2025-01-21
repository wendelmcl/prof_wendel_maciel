package Q2;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = {5, 4, 5, 3, 7};
		int soma = 0;
		
		System.out.println("Digite 5 numeros para os vetores!");
		
		for (int i = 0; i <= 4; i++){
			soma = soma + vetor[i]; 
		}
		
		System.out.println("Soma dos vatores do vetor: " + soma);
		
		sc.close();
	}

}
