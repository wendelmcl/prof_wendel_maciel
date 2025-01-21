package Q3;

import java.util.Scanner;

/* Elabore um programa em Java que solicite ao usuario que digite cinco números inteiros e armazene esses numeros em um vetor. Em seguida, o programa deve organizar os números em ordem crescente e exibir o vetor ordenado, sem o for para ordenar*/

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[3];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = sc.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                    System.out.println(vetor[i]);
                }
            }
        }

    }
}
