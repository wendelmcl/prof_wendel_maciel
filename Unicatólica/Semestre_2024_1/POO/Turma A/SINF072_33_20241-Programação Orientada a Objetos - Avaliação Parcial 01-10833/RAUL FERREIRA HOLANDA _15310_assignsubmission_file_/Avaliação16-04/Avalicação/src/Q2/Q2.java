package Q2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, soma = 0;
		
		for(int i = 0; i < 5; i++){
			System.out.println("Digite um valor: ");
			n = sc.nextInt();
			soma += + n;
		}
		sc.close();
		
		System.out.println("A soma dos numeros é: " + soma);
	}
}


