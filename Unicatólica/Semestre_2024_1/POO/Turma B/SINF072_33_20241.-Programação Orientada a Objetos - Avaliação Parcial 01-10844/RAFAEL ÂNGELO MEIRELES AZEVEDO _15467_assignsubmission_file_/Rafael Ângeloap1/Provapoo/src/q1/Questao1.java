package q1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int numero = sc.nextInt();

		int soma=0;
		int resto;

		while (numero > 0){
			resto = numero%10;
			soma += resto;
			numero/=10;
		}

		System.out.print("A soma dos dígitos do número é: "+soma);
		 sc.close();
		}
	
}
