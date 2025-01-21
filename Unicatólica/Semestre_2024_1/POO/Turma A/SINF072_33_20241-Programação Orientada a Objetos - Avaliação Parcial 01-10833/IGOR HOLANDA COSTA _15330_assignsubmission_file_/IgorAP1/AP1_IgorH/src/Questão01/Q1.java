package Questão01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int n = sc.nextInt();
		
		
		if (n / 1 == 0 || n / n == 0 || n % 2 == 1) {
			System.out.println("O numero digitado é primo");
		}else {
			System.out.println("O numero digitado não é primo");
		}

	}

}
