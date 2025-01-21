package numero_primo;
//desenvolva um algoritmo em Java que solicite ao usuario que digite um numero inteiro positivo e determine
//se esse numero � primo ou n�o. "O numero digitado � primo" "O numero digitado n�o � primo"



import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O n�mero digitado n�o � primo.");
        } else {
            boolean ehPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println("O n�mero digitado � primo.");
            } else {
                System.out.println("O n�mero digitado n�o � primo.");
            }
        }
    }
}
