package quest2;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {
		int vet,vet2,vet3,vet4,vet5;
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 5 números inteiros: ");
		vet = sc.nextInt();
		vet2 = sc.nextInt();
		vet3 = sc.nextInt();
		vet4 = sc.nextInt();
		vet5 = sc.nextInt();
		soma = vet + vet2 + vet3 + vet4 + vet5;
		System.out.println("A soma de todos esses elementos é: "+soma);
	}

}
