package laco_for;

import java.util.Scanner;

public class Exemplo_For {

	public static void main(String[] args) {
		int numero = 0, somatorio = 0, opcao = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números:  ");
		opcao = sc.nextInt();
		for(int i = 0; i < opcao; i++) {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			somatorio = somatorio + numero;
		}
		System.out.println("Somatório: " + somatorio);
	}
}
