package q3;

import java.util.Scanner;

public class Questao3 {

		    public static void main(String[] args) {
		        Scanner teclado = new Scanner(System.in);
		        int[] numeros = new int[5];

		        
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
		            numeros[i] = teclado.nextInt();
		        }
		        Arrays.sort(numeros);

		        System.out.println("Números digitados em ordem crescente:");
		        for (int num : numeros) {
		            System.out.print(num + " ");
		        }

		        teclado.close();
		    }
		
			
}
	



