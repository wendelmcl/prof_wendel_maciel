package revisao2;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, soma=0;
		String palavra = "";
		for(int i = 0; i < 5 ; i++) {
			System.out.println("Digite um valor: ");
			n = sc.nextInt();
			soma = soma + n;
		}
		System.out.println("Soma: " + soma);
		
		System.out.println("Digite teste: ");
		palavra = sc.next();
		while(palavra.equals("teste")) {
			System.out.println("OK...");
			System.out.println("Digite teste: ");
			palavra = sc.next();
		}
	}
}
