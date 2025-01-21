package Q3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[10];
		int impares = 0;
		int pares = 0;
		System.out.println("Digite 10 numeros:");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(i+1 +"° Numero");
			vect[i] = sc.nextInt();
			
			
		}
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}
		
		System.out.println("Impares: " + impares);
		System.out.println("Pares: " + pares);
	}

}
