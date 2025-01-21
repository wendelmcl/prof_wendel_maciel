package Segunda;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
	 int [] vetor = new  int[5];
			 Scanner sc = new Scanner(System.in);
	 int soma = 0;
		System.out.println("Digite 5 numeros");
	 for ( int i = 0; i < vetor. length; i++) {
		 vetor[i] = sc.nextInt();
		 soma = soma + vetor[i];
	 }
	 System.out.println("A soma dos 5 numeros e " + soma);
	}

}
