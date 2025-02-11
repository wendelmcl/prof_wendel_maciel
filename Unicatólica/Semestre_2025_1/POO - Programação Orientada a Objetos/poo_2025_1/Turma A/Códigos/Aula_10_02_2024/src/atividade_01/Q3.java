package atividade_01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		double valor_por_hora = 0.0, qtd_horas =0.0, salario = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor por hora: ");
		valor_por_hora = sc.nextDouble();
		System.out.println("Digite a quantidade de horas:");
		qtd_horas = sc.nextDouble();
		salario = valor_por_hora * qtd_horas;
		System.out.println("Salário: "+salario);
	}

}
