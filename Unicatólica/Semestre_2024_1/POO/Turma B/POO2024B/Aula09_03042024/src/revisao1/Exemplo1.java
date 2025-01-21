package revisao1;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1, n2, n3, soma=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("N1: ");
		n1 = sc.nextInt();
		System.out.println("N2: ");
		n2 = sc.nextInt();
		System.out.println("N3: ");
		n3 = sc.nextInt();
		soma = n1+n2+n3;
		System.out.println("Soma: "+soma);
	}
}
