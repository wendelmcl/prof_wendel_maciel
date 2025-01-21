package q3;

import java.util.Scanner;

public class Resposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = {1, 2, 3, 4, 5};

        System.out.println("Digite 5 números inteiros: ");

        for (int i = 0 ; i < 5; i++){
			System.out.println((i+1)+"º número:");
			vetor[i] = sc.nextInt();
		}
        
        sc.close();
    }
}
