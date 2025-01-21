//1
import java.util.Scanner;

public class ConversorHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char choice;
        do {
            System.out.print("Digite a hora no formato 24 horas (hh:mm): ");
            int hora = scanner.nextInt();
            int minuto = scanner.nextInt();

            converterPara12Horas(hora, minuto);

            System.out.print("Deseja converter outra hora? (S/N): ");
            choice = scanner.next().charAt(0);
        } while (Character.toUpperCase(choice) == 'S');

        scanner.close();
    }

    public static void converterPara12Horas(int hora, int minuto) {
        String periodo;
        if (hora >= 12) {
            periodo = "P.M.";
            if (hora > 12) {
                hora -= 12;
            }
        } else {
            periodo = "A.M.";
        }
        System.out.println("Hora convertida: " + hora + ":" + minuto + " " + periodo);
    }
}


//2
import java.util.Scanner;

public class CalculoPrestacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrestacoes = 0;
        double totalPago = 0;

        double valorPrestacao;
        do {
            System.out.print("Digite o valor da prestação (ou 0 para sair): ");
            valorPrestacao = scanner.nextDouble();

            if (valorPrestacao != 0) {
                System.out.print("Digite o número de dias em atraso: ");
                int diasAtraso = scanner.nextInt();

                double valorAPagar = valorPagamento(valorPrestacao, diasAtraso);
                totalPago += valorAPagar;
                totalPrestacoes++;

                System.out.println("Valor a ser pago: " + valorAPagar);
            }
        } while (valorPrestacao != 0);

        System.out.println("Relatório do Dia:");
        System.out.println("Total de prestações pagas: " + totalPrestacoes);
        System.out.println("Valor total pago: " + totalPago);

        scanner.close();
    }

    public static double valorPagamento(double valorPrestacao, int diasAtraso) {
        if (diasAtraso <= 0) {
            return valorPrestacao;
        } else {
            return valorPrestacao * (1 + 0.03 + diasAtraso * 0.001);
        }
    }
}


//3
import java.util.Scanner;

public class ContagemDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int qtdDigitos = contarDigitos(numero);
        System.out.println("O número de dígitos é: " + qtdDigitos);

        scanner.close();
    }

    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1; // Consideramos que 0 tem 1 dígito
        }
        int count = 0;
        while (numero != 0) {
            numero /= 10;
            count++;
        }
        return count;
    }
}


//4
import java.util.Scanner;

public class ReversoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int reverso = inverterNumero(numero);
        System.out.println("O reverso do número é: " + reverso);

        scanner.close();
    }

    public static int inverterNumero(int numero) {
        int reverso = 0;
        while (numero != 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }
        return reverso;
    }
}


//5
import java.util.Random;

public class JogoCraps {
    public static void main(String[] args) {
        Random rand = new Random();
        int dado1, dado2;
        int ponto = 0;

        do {
            dado1 = rand.nextInt(6) + 1;
            dado2 = rand.nextInt(6) + 1;
            int total = dado1 + dado2;

            System.out.println("Você rolou: " + dado1 + " + " + dado2 + " = " + total);

            if (ponto == 0) {
                if (total == 7 || total == 11) {
                    System.out.println("Natural! Você ganhou!");
                    return;
                } else if (total == 2 || total == 3 || total == 12) {
                    System.out.println("Craps! Você perdeu!");
                    return;
                } else {
                    ponto = total;
                    System.out.println("Seu ponto é: " + ponto);
                }
            } else {
                if (total == ponto) {
                    System.out.println("Você acertou o ponto! Você ganhou!");
                    return;
                } else if (total == 7) {
                    System.out.println("Você tirou 7! Você perdeu!");
                    return;
                }
            }
        } while (true);
    }
}
