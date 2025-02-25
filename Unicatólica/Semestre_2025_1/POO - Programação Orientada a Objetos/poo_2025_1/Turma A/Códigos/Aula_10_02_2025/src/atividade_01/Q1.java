package atividade_01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		double PI = 3.14, raio = 0.0, area = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do Raio: ");
		raio = sc.nextDouble();
		area = PI * (raio*raio);
		System.out.println("Área: "+area);
	}

}
