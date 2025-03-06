package exemplo_do_while;
import java.util.Scanner;
public class Exemplo3_DoWhile {

	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Número: ");
			num = sc.nextInt();
		}while(num < 1 || num > 10);
		System.out.println("Valor: " + num);
	}
}
