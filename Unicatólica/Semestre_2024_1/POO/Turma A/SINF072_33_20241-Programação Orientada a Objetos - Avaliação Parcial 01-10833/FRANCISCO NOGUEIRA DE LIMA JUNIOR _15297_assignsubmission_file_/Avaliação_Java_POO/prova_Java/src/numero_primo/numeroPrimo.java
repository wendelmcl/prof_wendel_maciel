package numero_primo;
//desenvolva um algoritmo em Java que solicite ao usuario que digite um numero inteiro positivo e determine
//se esse numero é primo ou não. "O numero digitado é primo" "O numero digitado não é primo"



import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O número digitado não é primo.");
        } else {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("O número digitado é primo.");
            } else {
                System.out.println("O número digitado não é primo.");
            }
        }
    }
}
