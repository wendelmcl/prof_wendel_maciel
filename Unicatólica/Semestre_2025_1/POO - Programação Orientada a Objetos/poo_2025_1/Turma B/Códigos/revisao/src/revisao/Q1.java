package revisao;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		// 2 10 -> Quantidade de números, soma, média
		int n1 = 0, n2 = 0, contador = 0, soma = 0;
		double media = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		n1 = sc.nextInt();
		System.out.println("Digite um valor: ");
		n2 = sc.nextInt();
		
		for(int i = n1+1; i < n2; i++) {
			contador++;
			soma = soma + i;
		}
		media = soma / contador;
		System.out.println("Quantidade de números: " + contador);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
