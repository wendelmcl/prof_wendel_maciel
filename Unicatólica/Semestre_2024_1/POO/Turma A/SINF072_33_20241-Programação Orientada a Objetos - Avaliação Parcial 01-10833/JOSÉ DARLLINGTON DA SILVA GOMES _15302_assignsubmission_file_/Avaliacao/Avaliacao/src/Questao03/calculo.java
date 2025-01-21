package Questao03;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Scanner leitor = new Scanner(System.in);
		int pares = 0, impares =0;
		String palavraPar = "par"; 
		String palavraImpar = "impar";
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Insira um número"); 
			vetor[i] = leitor.nextInt();
			if (vetor[i]%2 == 0) {
				pares += 1;
			} else {
				impares += 1;
			}
		
		} 
		
		if(pares > 1) {
			palavraPar = "pares";
		} 
		if(impares > 1) {
			palavraImpar = "impares";
		}
		leitor.close();
		System.out.print("Ao todo foram: " + pares + " " + palavraPar + " e " + impares + " " + palavraImpar);
			
	}

}
