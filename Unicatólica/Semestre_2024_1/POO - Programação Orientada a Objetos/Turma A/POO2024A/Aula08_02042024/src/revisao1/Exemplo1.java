package revisao1;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		int n1, n2, n3, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("N1: ");
		n1 = sc.nextInt();
		System.out.println("N2: ");
		n2 = sc.nextInt();
		System.out.println("N3: ");
		n3 = sc.nextInt();
		
		System.out.println("N1: "+n1+"\n"+"N2: "+n2
				+"\n"+"N3: "+n3+"\n");
		soma = n1+n2+n3;
		System.out.println("Soma: "+soma);
		if(soma >= 0 && soma <= 50) {
			System.out.println("Valor entre 0 e 50");
		}else if(soma >= 51 && soma <=100){
			System.out.println("Valor entre 51 e 100");
		}else{
			System.out.println("Valor maior que 100");
		}
	}
}
