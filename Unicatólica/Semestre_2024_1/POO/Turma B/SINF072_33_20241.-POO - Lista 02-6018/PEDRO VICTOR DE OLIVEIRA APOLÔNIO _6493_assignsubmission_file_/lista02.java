//1
public class NumerosUmAoLadoDoOutro {
    public static void main(String[] args) {
        // Imprimindo os números um abaixo do outro
        System.out.println("Imprimindo os números um abaixo do outro:");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        
        // Imprimindo os números um ao lado do outro
        System.out.println("\nImprimindo os números um ao lado do outro:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}


//2

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = Integer.MIN_VALUE;
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }
}


//3 
import java.util.Scanner;

public class SomaEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        double media = (double) soma / 5;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}


//4
public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


//5
import java.util.Scanner;

public class NumerosNoIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Números entre " + num1 + " e " + num2 + ":");
        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }
        
        scanner.close();
    }
}


//6 
import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] medias = new double[10];
        int contador = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite as quatro notas do aluno " + (i + 1) + ": ");
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += scanner.nextDouble();
            }
            medias[i] = soma / 4;
            if (medias[i] >= 7.0) {
                contador++;
            }
        }
        
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contador);
        
        scanner.close();
    }
}


//7
public class OperacoesComVetor {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10};
        int soma = 0;
        int multiplicacao = 1;
        
        System.out.println("Números do vetor:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
            soma += numero;
            multiplicacao *= numero;
        }
        
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);
    }
}


//8 
import java.util.Scanner;

public class InversaoIdadeAltura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] idades = new int[5];
        double[] alturas = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite a altura da pessoa " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
        }
        
        System.out.println("\nIdade e altura na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + " - Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }
        
        scanner.close();
    }
}


//9 
public class SomaQuadrados {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int somaQuadrados = 0;
        
        for (int numero : vetor) {
            somaQuadrados += numero * numero;
        }
        
        System.out.println("A soma dos quadrados dos elementos do vetor é: " + somaQuadrados);
    }
}


//10
public class IntercalacaoVetores {
    public static void main(String[] args) {
        int[] vetor1 = {1, 3, 5, 7, 9, 11,
