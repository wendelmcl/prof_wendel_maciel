package Q1;

import java.util.Scanner;

public class Algoritmo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo: ");
		int numero = sc.nextInt();
		
		if ((numero - 2) % numero == 0 && numero / 1 == numero){
			System.out.println("O número digitado é primo");
		}else{
			System.out.println("O número digitado não é primo");
		}
		
		sc.close();
	}

}
