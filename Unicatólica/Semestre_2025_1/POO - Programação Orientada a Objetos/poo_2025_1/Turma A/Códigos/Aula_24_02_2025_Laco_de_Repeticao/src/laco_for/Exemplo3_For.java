package laco_for;

import java.util.Scanner;

public class Exemplo3_For {
	public static void main(String[] args) {
		int inicio = 0, fim = 0, somatorio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Início: ");
		inicio = sc.nextInt();
		System.out.println("Fim: ");
		fim = sc.nextInt();
		for(int i = inicio + 1; i < fim; i++) {
			somatorio = somatorio + i;
			System.out.print(i + " ");
		}
		System.out.println("\nSomatório: " + somatorio);
	}
}
