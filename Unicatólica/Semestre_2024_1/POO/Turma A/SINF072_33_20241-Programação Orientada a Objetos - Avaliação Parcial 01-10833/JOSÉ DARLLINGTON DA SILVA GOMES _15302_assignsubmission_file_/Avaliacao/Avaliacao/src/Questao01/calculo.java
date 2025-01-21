package Questao01;

import java.util.Scanner;

public class calculo {

	public static void main(String[] args) {
		int numero;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Insira um número");
		numero = leitor.nextInt();
		
		if(numero%2 != 0 && numero%3 != 0) {
			System.out.print("O número digitado é primo");
		} else {
			System.out.print("O número digitado não é primo");
		}
		
		leitor.close();
	}

}
