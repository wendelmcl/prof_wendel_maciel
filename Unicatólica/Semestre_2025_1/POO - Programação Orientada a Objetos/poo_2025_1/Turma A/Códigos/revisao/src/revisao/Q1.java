package revisao;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		int base = 0, potencia = 0, resultado = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a base: ");
		base = sc.nextInt();
		System.out.println("Digite a potência: ");
		potencia = sc.nextInt();
		for(int i = 1; i <= potencia; i++) {
			resultado = resultado * base;
		}
		System.out.println("Resultado: " + resultado);
	}
}
