//Vetor 10 números inteiros.
package Prova;
import java.util.Scanner;
public class QuestaoTres {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Digite 10 números inteiros positivos: ");
	int vetor = (int) input.nextInt();
	for(int i = 10; i <= 10;i++){
	System.out.println("Vetor:[i]; "+i);
		
	if (i % i == 0) {
			System.out.println("Os números pares são:  " + vetor[i]);	
		}
		else {
			System.out.println("Os números negativos são:  " + vetor[i]);
		}
	}
		}
}



