package numeroprimo;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int numero = scanner.nextInt();
		
		if (numero % 1 == 0 && numero / numero == 1) {
			System.out.println("O número digitado é primo");
			
		} else {
			System.out.println("O número digitado não é primo");
			
		}
		
		scanner.close();
	}
	
}
