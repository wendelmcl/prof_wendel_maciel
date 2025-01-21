package q1;

import java.util.Scanner;

public class Resposta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digitos, d1, d2, d3;
        int soma;

        System.out.println("Digite um número inteiro positivo de até 3 digitos");
        digitos = sc.nextInt();

        if (digitos >= 1 && digitos <= 99) {
            System.out.println("Digite o número digito por digito: ");
            d1 = sc.nextInt();
            d2 = sc.nextInt();
            soma = d1 + d2;
            System.out.println("A soma dos digitos é:" + soma);
        } else if (digitos > 99 && digitos <= 999) {
            System.out.println("Digite o número digito por digito: ");
            d1 = sc.nextInt();
            d2 = sc.nextInt();
            d3 = sc.nextInt();
            soma = d1 + d2 + d3;
            System.out.println("A soma dos digitos é: " + soma);
        } else {
            System.out.println("Impossível calcular.");
        }

        sc.close();

    }
}
