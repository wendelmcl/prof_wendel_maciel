package q1;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1;
		System.out.println("Digite um numero para verificar: ");
		n1 = sc.nextInt();
		if(n1 % 1 == 0 && (n1 % n1 == 0 && n1 % 2 != 0)){
			System.out.println("primo");
		}else {
			System.out.println("Numero NAO primo");
			
		}

	}

}
