package q1;

import java.util.Scanner;

public class execucao {

	public static void main(String[] args) {
		int n1 = 0;
		int t1,t2;
		double t3;

		Scanner sc = new Scanner(System.in);
		System.out.println("------TESTE DOS NUMEROS PRIMOS------");
		System.out.println("Digite um número inteiro positivo");
		n1 = sc.nextInt();
		t1 = n1/2;
		t2 = n1%2;
		
		if(t1 <n1 && t2 !=0){
			System.out.println("O numero "+n1+" é primo");
		}else{
			System.out.println(n1+" Não é primo");
		}
		
		
		

	}

}
