package numeroprimo;
import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		
		int numero = scanner.nextInt();
		
		if (numero % 1 == 0 && numero / numero == 1) {
			System.out.println("O n�mero digitado � primo");
			
		} else {
			System.out.println("O n�mero digitado n�o � primo");
			
		}
		
		scanner.close();
	}
	
}
