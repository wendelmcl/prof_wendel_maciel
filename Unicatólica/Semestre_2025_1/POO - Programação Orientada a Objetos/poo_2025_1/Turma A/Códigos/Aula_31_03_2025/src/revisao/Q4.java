package revisao;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		double inicio = 0, fim = 0, soma = 0, media = 0, contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o início: ");
		inicio = sc.nextDouble();
		System.out.println("Digite o fim: ");
		fim = sc.nextDouble(); 
		for(double i = inicio + 1; i < fim; i++) {
			System.out.print(+ i + " ");
			soma = soma + i;
			contador++;
		}
		media = soma / contador;
		System.out.println("\nQuantidade de números: " + contador);
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
	}
}
