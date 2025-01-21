package Q1;

import java.util.Scanner;

public class Algoritimo {
    public static void main(String[] args) {
        System.out.println("Seja bem vinod(a): ");
         Scanner sc = new Scanner(System.in);
        

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();
        
        
        if (numero < 0) {
            System.out.println("O número digitado não é positivo.");
        } else {
            
            int soma = 0;
            int num = numero; 
            
            while (num > 0) {
                soma += num % 10; 
                num /= 10;
            }
            
          
            System.out.println("A soma dos dígitos de " + numero + " é: " + soma);
        }
        
        
        sc.close();
    }
}
