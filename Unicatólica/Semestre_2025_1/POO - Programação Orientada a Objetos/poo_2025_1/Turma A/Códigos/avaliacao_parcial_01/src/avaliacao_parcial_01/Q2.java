package avaliacao_parcial_01;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, primo = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite N1: ");
		n1 = sc.nextInt();
		System.out.println("Digite N2: ");
		n2 = sc.nextInt();
		
		for(int i = n1; i <= n2; i++) {
			primo = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					primo++;
				}
			}
			if(primo == 2) {
				System.out.print(i + " ");
			}
		}
	}
}
