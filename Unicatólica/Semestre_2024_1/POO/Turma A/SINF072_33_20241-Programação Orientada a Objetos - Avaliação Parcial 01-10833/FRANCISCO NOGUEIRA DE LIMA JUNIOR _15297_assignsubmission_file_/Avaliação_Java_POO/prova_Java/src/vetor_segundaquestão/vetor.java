package vetor_segundaquest�o;

	import java.util.Scanner;

	public class vetor {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int[] vetor = new int[5];

	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Digite o " + (i + 1) + "� n�mero inteiro: ");
	            vetor[i] = scanner.nextInt();
	        }

	        
	        int soma = 0;
	        for (int i = 0; i < 5; i++) {
	            soma += vetor[i];
	        }

	        
	        System.out.println("A soma dos elementos do vetor �: " + soma);
	    }
	}


