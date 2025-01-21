import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        char continuar;

        do {
            // Questão 1: Conversão de notação de 24 horas para 12 horas
            System.out.println("Digite o horário no formato de 24 horas (hh:mm):");
            String horario24 = scanner.next();
            String horario12 = (horario24);
            System.out.println("Horário no formato de 12 horas: " + horario12);

            // Questão 2: Cálculo do valor a ser pago por uma prestação de uma conta
            System.out.println("\nDigite o valor da prestação (ou zero para sair):");
            double valorPrestacao = scanner.nextDouble();
            if (valorPrestacao == 0) {
                break;
            }
            System.out.println("Digite o número de dias em atraso:");
            int diasAtraso = scanner.nextInt();
            double valorPago = valorPrestacao;
            System.out.println("Valor a ser pago: R$" + valorPago);

            // Questão 3: Função que informa a quantidade de dígitos de um número inteiro
            System.out.println("\nDigite um número inteiro:");
            int numero = scanner.nextInt();
            int quantidadeDigitos =(numero);
            System.out.println("Quantidade de dígitos: " + quantidadeDigitos);

            // Questão 4: Função que retorna o reverso de um número inteiro
            System.out.println("\nDigite um número inteiro para ser revertido:");
            int numeroReverso = (scanner.nextInt());
            System.out.println("Reverso do número: " + numeroReverso);

            // Questão 5: Implementação do jogo de Craps
            System.out.println("\nJogar Craps? (S/N)");
            char jogar = scanner.next().charAt(0);
            if (jogar == 'S' || jogar == 's') {
                System.out.println(jogar);
            }

            // Perguntar ao usuário se deseja continuar
            System.out.println("\nDeseja continuar? (S/N)");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    


    }
}
