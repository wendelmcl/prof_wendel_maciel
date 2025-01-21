package questao1;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número inteiro positivo : ");
		int num = sc.nextInt();
		if (num/1==0 || num%2!=0){
			System.out.println("O número digitado é Primo.");
		}else{
			System.out.println("O número digitado não é Primo.");
		}
		sc.close();
	}

}
