package condicionais_2;
import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua opção: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("Bom dia!!!");
				break;
			case 2:
				System.out.println("Boa tarde!!!");
				break;
			case 3:
				System.out.println("Boa noite!!!");
				break;
			default:
				System.out.println("Valor inválido.");
				break;
		}
		
	}
}
