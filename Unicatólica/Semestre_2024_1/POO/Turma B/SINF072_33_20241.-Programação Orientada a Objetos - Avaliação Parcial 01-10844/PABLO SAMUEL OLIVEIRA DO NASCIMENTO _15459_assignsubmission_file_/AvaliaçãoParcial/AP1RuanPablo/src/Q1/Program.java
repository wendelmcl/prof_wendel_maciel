package Q1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero que deseja verificar se � primo ou n�o");
		int number = sc.nextInt();
		int contador = 0;
		
		for(int i = 1; i<= number; i++){
			if(number % i == 0) {
				contador++;
			}
			
			
		}
		if(contador > 2) {
			System.out.println("Este numero n�o � primo");
		}
		else{
			System.out.println("Este numero � primo");
		}
		sc.close();
		
	}

}
