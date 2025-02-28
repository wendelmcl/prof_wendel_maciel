package exemplo_for;
import java.util.Scanner;
public class Exemplo3_For {
	public static void main(String[] args) {
		int n1 = 0, n2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite N1: ");
		n1 = sc.nextInt();
		System.out.println("Digite N2: ");
		n2 = sc.nextInt();
		for(int i = n1 + 1; i < n2; i++) {
			System.out.print(i + " ");
		}
	}
}
