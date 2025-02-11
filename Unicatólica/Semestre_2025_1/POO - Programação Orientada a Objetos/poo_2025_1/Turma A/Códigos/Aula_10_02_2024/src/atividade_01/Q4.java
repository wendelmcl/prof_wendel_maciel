package atividade_01;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		double F = 0.0, C = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperatura em Fahrenheit: ");
		F = sc.nextDouble();
		C = 5 * ((F - 32)/9);
		System.out.println("Temperatura em Celsius: "+C);
		System.out.printf("Temperatura em Celsius %.2f",C);

	}

}
