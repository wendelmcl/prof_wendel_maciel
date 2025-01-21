package Q3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[10];
		int impar = 0;
		int par = 0;
		
		for ( int i = 0; i < 10; i++){
			System.out.println("Digete um numero para o vetor");
			vetor[i] = sc.nextInt();
			if(vetor[i] % 2 == 0) {
				par++;
			}
			else{
				impar++;
			}
		}
		for(int i = 0; i < 10; i++);{
			System.out.println("Par");
		}
		System.out.println("Impar");
		

	}
	}

	
