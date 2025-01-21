package respostas.quest1;

import java.util.Scanner;

public class numero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número digitado deve ser positivo.");
            return;
        }

        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }

        System.out.println("A soma dos dígitos do número " + numero + " é: " + soma);
    }
}

