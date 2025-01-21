import java.util.Scanner;

//questao 1 Gabriel braga 2023020063
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("A area do circulo e: " + area);
    }
}


//questao 2

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.println("O dobro da area do quadrado e: " + (2 * area));
    }
}


//questao 3

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto voce ganha por hora? ");
        double valorHora = scanner.nextDouble();
        System.out.print("Quantas horas voce trabalhou no mes? ");
        double horasTrabalhadas = scanner.nextDouble();
        double salario = valorHora * horasTrabalhadas;
        System.out.println("Seu salario no mes e: R$ " + salario);
    }
}


//questao 4 

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = 5 * ((fahrenheit - 32) / 9);
        System.out.println("A temperatura em Celsius e: " + celsius);
    }
}


//questao 5

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);
    }
}

//questao 6 

mport java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double c = scanner.nextDouble();
        
        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        
        System.out.println("O maior numero e: " + maior);
    }
}

//questao 7

import java.util.Scanner;

public class MaiorEMenorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double c = scanner.nextDouble();
        
        double maior = a;
        if (b > maior) maior = b;
        if (c > maior) maior = c;
        
        double menor = a;
        if (b < menor) menor = b;
        if (c < menor) menor = c;
        
        System.out.println("O maior numero e: " + maior);
        System.out.println("O menor numero e: " + menor);
    }
}

//questao 8

import java.util.Scanner;

public class ProdutoMaisBarato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O preco do primeiro produto: ");
        double preco1 = scanner.nextDouble();
        System.out.print("O preco do segundo produto: ");
        double preco2 = scanner.nextDouble();
        System.out.print("O preco do terceiro produto: ");
        double preco3 = scanner.nextDouble();
        
        double maisBarato = preco1;
        if (preco2 < maisBarato) maisBarato = preco2;
        if (preco3 < maisBarato) maisBarato = preco3;
        
        System.out.println("Voce deve comprar o produto que custa: R$ " + maisBarato);
    }
}

//questao 9 

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[3];
        
        System.out.print("Digite o primeiro numero: ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        numeros[1] = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        numeros[2] = scanner.nextDouble();
        
        Arrays.sort(numeros);
        
        System.out.println("Numeros em ordem decrescente: " + numeros[2] + ", " + numeros[1] + ", " + numeros[0]);
    }
}

//questao 10

import java.util.Scanner;

public class SaudacaoTurno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Em que turno voce estuda? (M-matutino, V-Vespertino, N-Noturno): ");
        String turno = scanner.next().toUpperCase();
        
        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Invalido!");
                break;
        }
    }
}