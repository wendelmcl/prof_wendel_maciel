package q1;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro positivo: ");
		int n = sc.nextInt();
		if(n/1 == n && (n%n == 0 && n%2 != 0)){
			System.out.println("O n�mero digitado � primo");
		}else{
			System.out.println("O n�mero digitado n�o � primo");
		}
		sc.close();
	}

}
