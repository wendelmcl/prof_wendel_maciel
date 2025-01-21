package questao2;

import java.util.Scanner;

public class Vet5NumSoma {

	public static void main(String[] args) {
		int vetor[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		for(int i = 0; i < vetor.length; i++){
			System.out.print("Digite o " + (i+1) +"º número do vetor : ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		System.out.println("A soma dos elementos deste Vetor é : " + soma);
		sc.close();
	}

}
