package vetorpar;
import java.util.Scanner;

public class VetorPar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int [10];
		int impar = 0; 
		int par = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um numero para o vetor " + i);
			vetor[i] = scanner.nextInt();
			if (vetor[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
				
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("O vetor " + i + " é " + vetor[i]);
		}
		System.out.println("Há " + par + " pares");
		System.out.println("Há " + impar + " impares");
		
		scanner.close();
	}
	
	

}
