package atividade_01;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		double lado = 0.0, area = 0.0, dobro_area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do lado: ");
		lado = sc.nextDouble();
		area = (lado*lado);
		dobro_area = area * 2;
		System.out.println("Área: "+area);
		System.out.println("Dobro da Área: "+dobro_area);
	}
}
