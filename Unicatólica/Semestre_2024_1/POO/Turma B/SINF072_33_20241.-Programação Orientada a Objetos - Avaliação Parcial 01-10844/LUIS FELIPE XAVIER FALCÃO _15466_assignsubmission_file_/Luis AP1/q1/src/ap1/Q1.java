package ap1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int n = tec.nextInt();

		int s = 0;
		int resto;

		while (n > 0){
			resto = n%10;
			s += resto;
			n/=10;
		}

		System.out.print("A soma dos numeros informados são: "+s);
		 tec.close();
	}
}





	
	

