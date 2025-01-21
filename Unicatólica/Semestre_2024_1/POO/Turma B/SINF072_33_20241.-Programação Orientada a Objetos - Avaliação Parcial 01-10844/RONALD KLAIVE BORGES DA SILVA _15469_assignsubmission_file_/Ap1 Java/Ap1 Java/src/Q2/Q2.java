package Q2;

import java.util.Scanner;

/*Elabore um programa em java que conte e exiba a quantidade de vogais em uma palavra digitada pelo usuario. Considere que vogais são as letras 'a' 'e' 'i' 'o' e 'u', tanto em maiuscula quanto em minusculas */

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                cont++;
            } else if (palavra.charAt(i) == 'e' || palavra.charAt(i) == 'E') {
                cont++;
            } else if (palavra.charAt(i) == 'i' || palavra.charAt(i) == 'I') {
                cont++;
            } else if (palavra.charAt(i) == 'o' || palavra.charAt(i) == 'O') {
                cont++;
            } else if (palavra.charAt(i) == 'u' || palavra.charAt(i) == 'U') {
                cont++;
            }
            }
        System.out.println("A palavra " + palavra + " possui " + cont + " vogais");

    }
}
