package laco_while;
import java.util.Scanner;

public class Exemplo2_For {

	public static void main(String[] args) {
		int i = 0, opcao = 0, numero = 0, somatorio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Opção: ");
		opcao = sc.nextInt();
		while(i < opcao) {
			System.out.println("Número: ");
			numero = sc.nextInt();
			somatorio = somatorio + numero;
			i++;
		}
		System.out.println("Somatório: " + somatorio);
	}
}
