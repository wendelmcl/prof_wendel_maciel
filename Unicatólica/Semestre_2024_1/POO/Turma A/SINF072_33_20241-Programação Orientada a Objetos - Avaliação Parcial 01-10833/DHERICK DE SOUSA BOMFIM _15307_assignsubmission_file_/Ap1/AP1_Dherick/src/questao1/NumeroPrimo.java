package questao1;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro positivo : ");
		int num = sc.nextInt();
		if (num/1==0 || num%2!=0){
			System.out.println("O n�mero digitado � Primo.");
		}else{
			System.out.println("O n�mero digitado n�o � Primo.");
		}
		sc.close();
	}

}
