package com.exemplo.strategy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		
		Context context = new Context(new AddStrategy());
		
		System.out.println("Escolha uma opção 1 Sum, 2 subtract, 3 multiply: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			context.setStrategy(new AddStrategy());
			break;
		case 2:
			context.setStrategy(new SubtractStrategy());
			break;
		case 3:
			context.setStrategy(new MultiplyStrategy());
			break;
		default:
			System.out.println("Opção inválida");
		}
		int result = context.executeStrategy(n1, n2);
		
		System.out.println("Resultado: " + result);
		sc.close();
	}
}
