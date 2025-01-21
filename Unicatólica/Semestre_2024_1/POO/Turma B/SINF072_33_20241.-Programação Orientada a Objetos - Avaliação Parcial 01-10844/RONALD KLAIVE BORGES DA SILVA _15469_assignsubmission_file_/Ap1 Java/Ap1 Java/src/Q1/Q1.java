package Q1;

import java.util.Scanner;

/*Questão 1: Crie um algoritmo em Java que solicite ao usuario que digite m número inteiro positivo e calcule a soma de seus digitos. por exemplo, se o usuario digitar o número 123, o programa deve calcular e exibir a soma 1 + 2 + 3 = 6 */

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo: ");

        int usuario = sc.nextInt();

        int soma = 0;

        soma = (usuario % 10) + (usuario / 10 % 10) + (usuario / 100 % 10);

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
