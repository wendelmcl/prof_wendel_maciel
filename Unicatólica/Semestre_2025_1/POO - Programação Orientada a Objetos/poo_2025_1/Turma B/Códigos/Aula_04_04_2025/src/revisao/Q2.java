package revisao;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		int valor = 1, soma = 0;
		Scanner sc = new Scanner(System.in);
		
		while(valor != 0) {
			System.out.println("Digite um valor: ");
			valor = sc.nextInt();
			soma = soma + valor;
		}
		System.out.println("Soma: " + soma);
	}
}
