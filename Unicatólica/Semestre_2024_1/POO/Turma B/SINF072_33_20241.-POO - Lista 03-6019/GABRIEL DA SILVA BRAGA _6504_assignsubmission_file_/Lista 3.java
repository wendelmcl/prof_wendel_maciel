// Gabriel braga 2023020063

//Questao 1
import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite a hora no formato 24 horas (hora minuto) ou '-1' para sair: ");
            int hora = scanner.nextInt();
            if (hora == -1) {
                break; 
            }
            int minuto = scanner.nextInt();
            
            char amPm = 'A'; 
            String horarioConvertido = converterHorario(hora, minuto, amPm);
            exibirSaida(horarioConvertido);
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }

    public static String converterHorario(int hora, int minuto, char amPm) {
        if (hora >= 12) {
            amPm = 'P';
            if (hora > 12) {
                hora -= 12;
            }
        } else if (hora == 0) {
            hora = 12; 
        }
        return String.format("%02d:%02d %c.M.", hora, minuto, amPm);
    }

    public static void exibirSaida(String horarioConvertido) {
        System.out.println("Horário convertido: " + horarioConvertido);
    }
}

//questao 2

import java.util.Scanner;

public class CalculadoraDePrestacoes {
    
    private static int totalPrestacoes = 0;
    private static double valorTotalPago = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o valor da prestacao (ou 0 para encerrar): ");
            double valorPrestacao = scanner.nextDouble();
            
            if (valorPrestacao == 0) {
                break;
            }

            System.out.print("Digite o numero de dias em atraso: ");
            int diasAtraso = scanner.nextInt();

            double valorAPagar = valorPagamento(valorPrestacao, diasAtraso);
            exibirValorAPagar(valorAPagar);

            
            totalPrestacoes++;
            valorTotalPago += valorAPagar;
        }

        
        exibirRelatorioDoDia();
        scanner.close();
    }

    public static double valorPagamento(double valorPrestacao, int diasAtraso) {
        if (diasAtraso > 0) {
            double multa = valorPrestacao * 0.03;
            double jurosPorDia = valorPrestacao * 0.001 * diasAtraso;
            return valorPrestacao + multa + jurosPorDia;
        } else {
            return valorPrestacao; 
        }
    }

    public static void exibirValorAPagar(double valor) {
        System.out.printf("Valor a ser pago: R$%.2f\n", valor);
    }

    public static void exibirRelatorioDoDia() {
        System.out.println("\nRelatorio do dia:");
        System.out.println("Total de prestacoes pagas: " + totalPrestacoes);
        System.out.printf("Valor total pago: R$%.2f\n", valorTotalPago);
    }
}

// Questao 3

public class Digitos {

    public static void main(String[] args) {
        int numero = 123456;
        int qdg = contarDigitos(numero);
        System.out.println("O numero " + numero + " tem " + qdg + " digitos.");
    }

    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        
        int contador = 0;
        numero = Math.abs(numero); 
        
        while (numero > 0) {
            numero /= 10; 
            contador++; 
        }
        
        return contador;
    }
}

//questao 4

public class Reverso {

    public static void main(String[] args) {
        int numero = 127;
        int nr = rv(numero);
        System.out.println("O reverso do numero " + numero + " e " + nr + ".");
    }

    public static int rv(int numero) {
        int reverso = 0;
        
        while (numero != 0) {
            int digito = numero % 10; 
            reverso = reverso * 10 + digito; 
            numero /= 10; 
        }
        
        return reverso;
    }
}

//questao 5 

import java.util.Random;
import java.util.Scanner;

public class Craps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Bem-vindo ao jogo de Craps!");
        System.out.print("Pressione 'Enter' para lancar os dados...");
        scanner.nextLine();
        
        int lancamento = lancar(random);
        System.out.println("Voce lancou um " + lancamento + ".");
        
        if (lancamento == 7 || lancamento == 11) {
            System.out.println("Voce tirou um 'natural' e ganhou!");
        } else if (lancamento == 2 || lancamento == 3 || lancamento == 12) {
            System.out.println("Isso e 'craps'. Voce perdeu.");
        } else {
            int ponto = lancamento;
            System.out.println("Seu 'Ponto' e " + ponto + ". Voce precisa tirar " + ponto + " novamente antes de tirar um 7 para ganhar.");
            
            while (true) {
                System.out.print("Pressione 'Enter' para lancar os dados novamente...");
                scanner.nextLine();
                
                lancamento = lancar(random);
                System.out.println("Voce lancou um " + lancamento + ".");
                
                if (lancamento == ponto) {
                    System.out.println("Voce tirou o seu 'Ponto' novamente e ganhou!");
                    break;
                } else if (lancamento == 7) {
                    System.out.println("Voce tirou um 7 antes do seu 'Ponto' e perdeu.");
                    break;
                }
            }
        }
        
        scanner.close();
    }

    private static int lancar(Random random) {
        int dado1 = 1 + random.nextInt(6);
        int dado2 = 1 + random.nextInt(6);
        return dado1 + dado2;
    }
}
