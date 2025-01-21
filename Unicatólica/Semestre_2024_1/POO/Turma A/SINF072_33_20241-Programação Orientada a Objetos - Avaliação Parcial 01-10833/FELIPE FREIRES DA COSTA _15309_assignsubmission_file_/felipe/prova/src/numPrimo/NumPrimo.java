package numPrimo;

import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
		int numP = 0;
		
		if(numP == 1 / ( num / num)){
			System.out.println("O numero Digitado é primo");
		}else{
			System.out.println("O numero digitado nao é primo");
		}
	}

}
