package revisao4;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho;
		System.out.println("Digite o tamanho do Vetor: ");
		tamanho = sc.nextInt();
		int[] vetor = new int[tamanho];
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}
		for(int i = 0; i < vetor.length;i++) {
			System.out.println("Vetor["+i+"]: "+vetor[i]);
		}
		
	}
}
