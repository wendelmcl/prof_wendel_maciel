package revisao1;

import java.util.Scanner;

public class Exemplo2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, soma = 0;
		System.out.println("N1: ");
		n1 = sc.nextInt();
		System.out.println("N2: ");
		n2 = sc.nextInt();
		soma = n1+n2;
		if(soma >= 0 && soma <= 20){
			System.out.println("0 - 20");
		}else if(soma >= 21 && soma <= 40){
			System.out.println("21 - 40");
		}else{
			System.out.println("Soma maior que 40");
		}
	}
}
