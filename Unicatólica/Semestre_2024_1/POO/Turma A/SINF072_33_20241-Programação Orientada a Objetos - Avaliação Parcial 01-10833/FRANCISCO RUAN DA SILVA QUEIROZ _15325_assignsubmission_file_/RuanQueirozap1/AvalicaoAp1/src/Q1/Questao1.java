package Q1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero positivo inteiro: ");
		int numero = sc.nextInt();
		
		if(numero/numero == numero); {
			System.out.println("O n�mero digitado � primo! ");
		}else{
			System.out.println("O n�mero digitado n�o � primo! ");
		}
		
		

	}

}
