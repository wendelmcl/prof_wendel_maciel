package q1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro positivo: ");
		int num = sc.nextInt();
		if (num % 2 != 0){
			System.out.println("O n�mero digitado � primo!");
		} else {
			System.out.println("O n�mero digitado N�O � primo!");
		}
		sc.close();
	}

}
