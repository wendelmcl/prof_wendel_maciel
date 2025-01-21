package Q2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vect = new int[5];
		int soma = 0;
		System.out.println("Digite 5 numeros:");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(i+1 +"° Numero");
			vect[i] = sc.nextInt();
			soma += vect[i];
			
			
			
		}
		System.out.println("Os numeros presentes no vetor são:");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
			
		}
		System.out.println("A soma de todos os elementos do vetor é: " + soma);
		
		sc.close();

	}

}
