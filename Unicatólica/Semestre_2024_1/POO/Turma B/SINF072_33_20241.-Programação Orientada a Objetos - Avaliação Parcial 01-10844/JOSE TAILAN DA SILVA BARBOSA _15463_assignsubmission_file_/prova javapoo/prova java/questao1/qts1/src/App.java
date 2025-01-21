import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;
        System.out.println("Digite um numero inteiro positivo: ");
        numero = sc.nextInt();
        if (numero > 0) {
            while (numero > 0) {
                soma += numero % 10;
                numero = numero / 10;
            }
            System.out.println("A soma dos digitos e: " + soma);
        } else {
            System.out.println("Numero invalido, digite outro.");
        }
    }
}