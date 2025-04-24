package avaliacao_parcial_01;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int n1 = 0, anterior = 0, posterior = 1, fibonacci = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1 = sc.nextInt();
		
		for(int i = 0; i < n1; i++) {
			System.out.print(fibonacci + " ");
			fibonacci = anterior + posterior;
			posterior = anterior;
			anterior = fibonacci;
		}
	}
}
