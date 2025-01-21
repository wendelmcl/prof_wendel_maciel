package q1;
import java.util.Scanner;
public class SomaDigitos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número inteiro e positivo");
        int numero = scanner.nextInt();
        int soma = calcularDigitos(numero);
        System.out.println("A soma dos dígitos é: " + soma);
    }
    public static int calcularDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            int digito = numero % 10;        
            soma += digito;   
            numero /= 10;
        }
        return soma;
		}
	}
	

