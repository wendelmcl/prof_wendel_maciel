package vetorsoma;
import java.util.Scanner;

public class VetorSoma {
	
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int vetor[] = {1,2,3,4,5};
		int somavetor = 0;
		for (int i = 0; i < 5; i++) {
			
			somavetor = vetor[i] + somavetor;
			
		}
		System.out.println(somavetor);
	}

}
