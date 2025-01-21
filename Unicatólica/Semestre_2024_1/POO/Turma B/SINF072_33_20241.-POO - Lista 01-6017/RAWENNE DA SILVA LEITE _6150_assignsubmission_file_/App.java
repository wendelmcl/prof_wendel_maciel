import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // questão 1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math .pow(raio, 2);

        System.out.println("A área do circulo é: " + area);

        // questão 2

        System.out.println("Digite a base do quadrado: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do quadrado: ");
        double altura = scanner.nextDouble();


        double aQuadrado = base  * altura ;

        System.out.println("A área do quadrado é: " + aQuadrado);

        double dobroA = aQuadrado * 2;

        System.out.print("A área em dobro do quadrado é: " + dobroA);

        // quastão 3


        System.out.println("Digite quanto você ganha por hora: ");
        double salario = scanner.nextDouble();

        System.out.println("Digite o número de horas você trabalha por mês: ");
        double hora = scanner.nextDouble();

        double valorM = salario * hora;

        System.out.println("Vôce recebe por mês o vaor de: " + valorM );

        // quastão 4

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double Fa = scanner.nextDouble();

        double Celsius = 5 * ((Fa - 32)/9);

        System.out.println("O grau em celsius é:" + Celsius);

        // questão 5

        System.out.println("Digite o grau em Celsius: ");
        double grauC = scanner.nextDouble();

        double grauF = (grauC * 9/5) + 32;

        System.out.println("O grau em Fahrenheit é: " + grauF);

        // questão 6

        System.out.println("Digite o número 1:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o numero 2: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o numero 3: ");
        double numero3 = scanner.nextDouble();

        double maiornumero = numero1;

       if(numero2 > maiornumero) {
        maiornumero = numero2;
       }

       if(numero3 > maiornumero) {
        maiornumero = numero3;
       }

       System.out.println("O maior número é: " + maiornumero);   
       
       
        // questão 7

        System.out.println("Digite o número 1:");
        double numero11 = scanner.nextDouble();

        System.out.println("Digite o numero 2: ");
        double numero22 = scanner.nextDouble();

        System.out.println("Digite o numero 3: ");
        double numero33 = scanner.nextDouble();

        double maiorNumero = numero11;
        double menorNumero = numero11;

       if(numero22 > maiorNumero) {
        maiornumero = numero22;
       }

       if(numero33 > maiorNumero) {
        maiornumero = numero33;
       }

       if (numero22 < menorNumero){
        menorNumero = numero22;
       }

       if(numero33 < menorNumero) {
        menorNumero = numero33;
       }

       System.out.println("O maior número é: " + maiornumero);   
       System.out.println("O menor número é: " + menorNumero);

       // questão 8

       System.out.println("Digite o oreço do produto 1:");
       double preco1 = scanner.nextDouble();

       System.out.println("Digite o preço do produto 2: ");
       double preco2 = scanner.nextDouble();

       System.out.println("Digite o preço do produto 3: ");
       double preco3 = scanner.nextDouble();


       double melhorproduto = preco1;

       if (preco2 < melhorproduto) {
        melhorproduto = preco2;
       }

       if(preco3 < melhorproduto) {
        melhorproduto = preco3;
       }

       System.out.println(" o produto com o melhor preço custa: " + melhorproduto);

       // questão 9

       System.out.println("Digite o primeiro número: ");
        double numero10 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero20 = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero30 = scanner.nextDouble();

        System.out.println("Os números em ordem decrescente:");

        if (numero1 >= numero20 && numero10 >= numero30) {
            System.out.println(numero10);
            if (numero20 >= numero30) {
                System.out.println(numero20);
                System.out.println(numero30);
            } else {
                System.out.println(numero30);
                System.out.println(numero20);
            }
        } else if (numero20 >= numero10 && numero20>= numero30) {
            System.out.println(numero20);
            if (numero10 >= numero30) {
                System.out.println(numero10);
                System.out.println(numero30);
            } else {
                System.out.println(numero30);
                System.out.println(numero10);
            }
        } else {
            System.out.println(numero30);
            if (numero10 >= numero20) {
                System.out.println(numero10);
                System.out.println(numero20);
            } else {
                System.out.println(numero20);
                System.out.println(numero10);
            }
        }

        // questão 10

        System.out.println("Em que turno você estuda?");
        System.out.println("M - Matutino");
        System.out.println("V - Vespertino");
        System.out.println("N - Noturno");
        System.out.print("Digite o turno (M/V/N): ");
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
