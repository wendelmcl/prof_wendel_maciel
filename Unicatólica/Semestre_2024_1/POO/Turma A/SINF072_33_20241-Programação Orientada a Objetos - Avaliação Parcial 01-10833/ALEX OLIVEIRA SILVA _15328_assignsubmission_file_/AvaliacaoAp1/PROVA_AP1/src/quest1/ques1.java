package quest1;

import java.util.Scanner;

public class ques1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println("Digite um n�mero; ");
		num = sc.nextInt();
		
		if (num/num == 1){
			System.out.println("O n�mero digitado � primo.");
		}
		else{
			System.out.println("O n�mero digitado n�o � primo.");
		}
		
	}

}
