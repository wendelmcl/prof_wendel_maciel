// 1
import java.util.Scanner;

public class CalculoAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da Área de um Círculo");
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double areaCirculo = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + areaCirculo);

        scanner.close();
    }
}


//2
import java.util.Scanner;

public class AreaQuadradoEDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo da Área de um Quadrado e o Dobro");
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        double areaQuadrado = Math.pow(lado, 2);
        double dobroAreaQuadrado = 2 * areaQuadrado;

        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("O dobro da área do quadrado é: " + dobroAreaQuadrado);

        scanner.close();
    }
}


//3

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cálculo do Salário");
        System.out.print("Digite o valor que você ganha por hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("Seu salário no mês é: " + salario);

        scanner.close();
    }
}


//4

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão de Fahrenheit para Celsius");
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = 5 * ((temperaturaFahrenheit - 32) / 9);

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);

        scanner.close();
    }

}


//5
import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversão de Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaFahrenheit);

        scanner.close();
    }
}


//6
import java.util.Scanner;

public class EncontrarMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Encontrando o Maior Número");
        System.out.print("Digite três números separados por espaço: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double maior = Math.max(num1, Math.max(num2, num3));

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}


//7

import java.util.Scanner;

public class EncontrarMaiorEMenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Encontrando o Maior e o Menor Número");
        System.out.print("Digite três números separados por espaço: ");
        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();

        double menor = Math.min(numA, Math.min(numB, numC));
        double maior = Math.max(numA, Math.max(numB, numC));

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}


//8

import java.util.Scanner;

public class DecisaoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Decisão de Compra");
        System.out.print("Digite o preço dos três produtos separados por espaço: ");
        double preco1 = scanner.nextDouble();
        double preco2 = scanner.nextDouble();
        double preco3 = scanner.nextDouble();

        double menorPreco = Math.min(preco1, Math.min(preco2, preco3));

        System.out.println("Você deve comprar o produto de preço: " + menorPreco);

        scanner.close();
    }
}

//9
import java.util.Scanner;

public class OrdenarNumerosDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ordenando Três Números em Ordem Decrescente");
        System.out.print("Digite três números separados por espaço: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Os números em ordem decrescente são: " + a + ", " + b + ", " + c);

        scanner.close();
    }
}


//10
import java.util.Scanner;

public class SaudacaoConformeTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saudação Conforme o Turno");
        System.out.print("Em que turno você estuda? (M-matutino, V-vespertino, N-noturno): ");
        char turno = scanner.next().charAt(0);

        switch (turno) {
            case 'M':
            case 'm':
                System.out.println("Bom Dia!");
                break;
            case 'V':
            case 'v':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
            case 'n':
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido!");
        }

        scanner.close();
    }
}
