package atividade_01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		double C = 0.0, F = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperatura em Celsius: ");
		C = sc.nextDouble();
		F = (C * 1.8) + 32;
		System.out.println("Temperatura em Fahrenheit: "+F);
		System.out.printf("Temperatura em Fahrenheit: %.2f", F);

	}

}
