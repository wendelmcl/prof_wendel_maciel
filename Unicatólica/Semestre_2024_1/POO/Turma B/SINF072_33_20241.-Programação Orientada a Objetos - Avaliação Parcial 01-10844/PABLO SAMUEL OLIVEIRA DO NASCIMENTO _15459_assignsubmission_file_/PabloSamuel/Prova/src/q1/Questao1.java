package q1;

import java.util.Scanner;

public class Questao1 {
	    public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        System.out.print("Digite um número inteiro positivo: ");
	        int numero = entrada.nextInt();
	        int soma = 0;

	       
	        while (numero > 0) {
	            int digito = numero % 10;
	            soma += digito;
	            numero /= 10;
	        }

	        System.out.println("A soma dos dígitos é: " + soma);
	    }
	}
	
	


	
	


