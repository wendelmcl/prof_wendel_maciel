package q1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		
		if(a==1 || a==2 || a==3 || a==5 || a==7){
			System.out.println("O número é primo!");
		}else if(a%2==0 || a%3==0 || a%5==0 || a%7==0){
			System.out.println("O número não é primo!");
		}else{
			System.out.println("O número é primo!");
		}
		
	}

}
