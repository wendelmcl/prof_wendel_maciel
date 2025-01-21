
package q3;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os 5 numeros: ");
        for (int i = 0; i < vetor.length; i++) {
            int entrada = input.nextInt();
            vetor[i] = entrada;
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
        
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
        System.out.println("Os numeros em ordem crescente são: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}