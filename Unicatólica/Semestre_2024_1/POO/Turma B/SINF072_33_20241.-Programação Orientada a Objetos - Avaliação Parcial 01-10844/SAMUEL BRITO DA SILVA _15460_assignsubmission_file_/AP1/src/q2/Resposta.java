package q2;

import java.util.Scanner;

public class Resposta {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int palavra;

        for (int i = 0 ; i < 5; i++){
            System.out.println("Digite as vogais minúsculas");
            System.out.println((i+1)+"º letra:");
			vetor[i] = sc.nextInt();
		}

        for (int i = 5 ; i < 9; i++){
            System.out.println("Digite as vogais maiúsculas");
            System.out.println((i+1)+"º letra:");
			vetor[i] = sc.nextInt();
		}

        for (int i = 0 ; i < 9; i++){
            System.out.println("Digite uma palavra qualquer");
            palavra = sc.nextInt();
            if (vetor[i] == palavra){

            }
		}
        
        sc.close();
    }
}
