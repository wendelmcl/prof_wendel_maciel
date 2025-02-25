package laco_for;
import java.util.Scanner;
public class Exemplo2_For {

	public static void main(String[] args) {
		int inicio = 0, fim = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o início: ");
		inicio = sc.nextInt();
		System.out.println("Digite o intervalo: ");
		fim = sc.nextInt();
		for(int i = inicio+1; i < fim; i++) {
			System.out.print(i+ " ");
		}
	}
}