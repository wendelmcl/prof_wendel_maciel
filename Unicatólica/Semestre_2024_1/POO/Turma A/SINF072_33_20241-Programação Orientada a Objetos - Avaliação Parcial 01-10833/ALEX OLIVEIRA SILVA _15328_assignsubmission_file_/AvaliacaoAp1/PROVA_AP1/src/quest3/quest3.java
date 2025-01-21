package quest3;

import java.util.Scanner;

public class quest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant = 10;
		int[] vetor = new int[quant];
		for(int i = 0; i < vetor.length;i++){
			System.out.println("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}

	}

}
