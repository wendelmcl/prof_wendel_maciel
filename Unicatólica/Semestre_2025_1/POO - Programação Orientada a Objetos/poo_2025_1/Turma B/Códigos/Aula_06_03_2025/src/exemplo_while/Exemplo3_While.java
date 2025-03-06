package exemplo_while;
import java.util.Scanner;
public class Exemplo3_While {
	
	public static void main(String[] args) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		while(num != 0) {
			System.out.println("Número: ");
			num = sc.nextInt();
		}
	}
}
