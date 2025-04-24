package avaliacao_parcial_01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		int valor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual tabuada você quer ver? ");
		valor = sc.nextInt();
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(valor + "x" + i + " = " + (valor * i));
		}
	}
}
