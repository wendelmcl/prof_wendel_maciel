package q1;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		int num = sc.nextInt();
		if (num % 2 != 0){
			System.out.println("O número digitado é primo!");
		} else {
			System.out.println("O número digitado NÃO é primo!");
		}
		sc.close();
	}

}
