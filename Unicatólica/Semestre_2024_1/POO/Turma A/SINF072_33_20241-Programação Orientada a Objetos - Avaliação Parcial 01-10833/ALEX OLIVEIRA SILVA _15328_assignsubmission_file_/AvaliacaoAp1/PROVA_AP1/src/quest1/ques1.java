package quest1;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite um número; ");
		num = sc.nextInt();
		
		if (num/num == 1){
			System.out.println("O número digitado é primo.");
		}
		else{
			System.out.println("O número digitado não é primo.");
		}
		
	}

}
