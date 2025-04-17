package revisao;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		int inicio = 0, fim = 0, contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o início: ");
		inicio = sc.nextInt();
		System.out.println("Digite o fim: ");
		fim = sc.nextInt();
		for(int i = inicio+1; i < fim; i++) {
			contador++;
		}
		System.out.println("A quantidade de números entre "+""
				+ inicio + " e "+fim + " é: "+contador +" números");
		
	}
}
