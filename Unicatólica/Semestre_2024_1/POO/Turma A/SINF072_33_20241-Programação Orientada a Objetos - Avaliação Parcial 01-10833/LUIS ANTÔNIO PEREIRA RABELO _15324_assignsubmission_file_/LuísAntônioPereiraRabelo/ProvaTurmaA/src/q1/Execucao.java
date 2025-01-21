package q1;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo: ");
		int n = sc.nextInt();
		if(n/1 == n && (n%n == 0 && n%2 != 0)){
			System.out.println("O número digitado é primo");
		}else{
			System.out.println("O número digitado não é primo");
		}
		sc.close();
	}

}
