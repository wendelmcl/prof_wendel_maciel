package condicionais_2;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int opcao = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma opcao: ");
		opcao = sc.nextInt();
		if(opcao == 1) {
			System.out.println("Bom dia!!!");
		}else if(opcao == 2) {
			System.out.println("Boa tarde!!!");
		}else if(opcao == 3) {
			System.out.println("Boa noite!!!");
		}else {
			System.out.println("Valor inválido.");
		}
	}
}
