package q2;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];
		int soma = 0;
		for(int i = 0;i < vetor.length; i++){
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
			soma = soma + vetor[i];
		}
		System.out.println("Soma: " + soma);
		sc.close();
	}

}
