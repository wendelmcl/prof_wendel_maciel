package exemplo_for;
import java.util.Scanner;
public class Exemplo2_For {
	public static void main(String[] args) {
		int n1 = 0, somatorio = 0, opcao = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de números: ");
		opcao = sc.nextInt();
		for(int i = 1; i <= opcao; i++) {
			System.out.println("Digite o valor: ");
			n1 = sc.nextInt();
			somatorio = somatorio + n1;
		}
		System.out.println("Somatório: " + somatorio);
	}
}