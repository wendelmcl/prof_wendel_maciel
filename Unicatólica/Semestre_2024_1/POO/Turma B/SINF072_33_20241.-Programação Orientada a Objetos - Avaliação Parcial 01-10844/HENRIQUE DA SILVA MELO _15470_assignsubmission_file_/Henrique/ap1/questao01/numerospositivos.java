import java.utill.Scanner;

public class numeros positivos {
	public static void main(String[] args) {
		
		java.util.Scanner scanner = new Scanner(System.in);
		          
		          System.out.println("Digite um número inteiro positivo:");
		          int numero = scanner.nextInt();
		          
		          if (numero < 0) {
		        	  System.out.println("O numero deve ser positivo.");
		        	  return;
		          }
		          
		          int soma = 0;
		          int numeroOriginal = numero;
		          while (numero > 0) {
		        	  int digito = numero %;
		        	  soma += digito;
		        	  numero /= 10;
		          }
		          
		          System.out.println("A soma dos digitos de " + numeroOriginal + é: " + soma);
		          
		        	  scanner.close();
		         }
		    }
		}

