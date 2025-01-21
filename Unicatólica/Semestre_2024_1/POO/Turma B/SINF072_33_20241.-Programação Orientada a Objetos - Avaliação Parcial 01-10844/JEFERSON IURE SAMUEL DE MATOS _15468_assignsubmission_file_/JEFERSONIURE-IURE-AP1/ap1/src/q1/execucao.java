package q1;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		String vetor = Integer.toString(num);
		for (int i = 0; i < vetor.length(); i++) {
			char digit = vetor.charAt(i);
			int digitToInt = Character.getNumericValue(digit);
			soma += digitToInt;
		}
		
		System.out.println("A soma dos digitos do numero é: " + soma);
		
	}

}