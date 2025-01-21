
package q1;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada = 0;
        int soma = 0;

        System.out.println("Digite o numero inteiro positivo: ");
        entrada = input.nextInt();

        if (entrada > 0) {
           
            String entradaString = Integer.toString(entrada);
           
            for (int i = 0; i < entradaString.length(); i++) {
               
                soma += Character.getNumericValue(entradaString.charAt(i));
            }
           
            System.out.println("A soma dos digitos e: " + soma);
        } else {
            
            System.out.println("O numero digitado deve ser inteiro e positivo.");
        }
    }
}