package Q1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		int n1 = sc.nextInt();
	
		if ((n1 / n1 == 1) && (n1 / 1 == n1)) {
			System.out.println("O numero digitado � primo");
		}
		
		else {
			System.out.println("O numero digitado n�o � primo!");
		}
	
			
		
		
	}

}
