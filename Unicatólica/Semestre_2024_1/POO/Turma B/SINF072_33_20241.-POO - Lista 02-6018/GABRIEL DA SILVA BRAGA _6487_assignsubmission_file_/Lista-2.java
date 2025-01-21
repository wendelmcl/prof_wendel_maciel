import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // questão  1

        System.out.println("Números de 1 a 20 , um abaixo do outro: ");

        for(int i = 1; i<= 20; i++){
            System.out.println(i);
        }

        System.err.println("Números de 1 a 20, um do lado do outro: ");

        for(int e = 1; e <= 20; e++){
            System.out.print(e + " ");
        }



        // questão 2

        Scanner scanner = new Scanner (System.in);


        int maiorNumero = Integer.MIN_VALUE; 
        
       
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            
            
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        
       
        System.out.println("O maior número digitado é: " + maiorNumero);


        // questão 3 

        int soma = 0;
        double media;
        
        
        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero; 
        }
        
        
        media = (double) soma / 5;
        
       
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);

        // questão 4

        System.out.println("Números ímpares entre 1 e 50:");
        
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        
            // questão 5 

        System.out.println("Digite dois números inteiros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        System.out.println("Números no intervalo entre " + numero1 + " e " + numero2 + ":");
        for (int iii = numero1 + 1; iii < numero2; iii++) {
            System.out.print(iii + " ");
        }

        // questão 6

        int quantidadeAlunosComMediaMaiorOuIgualASete = 0;
        
        for (int ii = 1; ii <= 10; ii++) {
            System.out.println("Aluno " + ii);
            double somaNotas = 0;
            for (int j = 1; j <= 4; j++) {
                System.out.println("Digite a nota " + j + ":");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double meddia = somaNotas / 4;
            System.out.println("Média do aluno " + ii + ": " + media);
            if (media >= 7.0) {
                quantidadeAlunosComMediaMaiorOuIgualASete++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + quantidadeAlunosComMediaMaiorOuIgualASete);

        // questão 7

        int[] numeros = new int[5];
        
        System.out.println("Digite 5 números inteiros:");
        for (int iiiii = 0; iiiii < 5; iiiii++) {
            numeros[iiiii] = scanner.nextInt();
        }
        
        int somas = 0;
        int multiplicacao = 1;
        
        System.out.print("Números digitados: ");
        for (int iiii = 0; iiii < 5; iiii++) {
            System.out.print(numeros[iiii] + " ");
            somas += numeros[iiii];
            multiplicacao *= numeros[iiii];
        }
        
        System.out.println("\nSoma: " + somas);
        System.out.println("Multiplicação: " + multiplicacao);

        // questão 8

        int[] idades = new int[5];
        double[] alturas = new double[5];
        
        for (int in = 0; in < 5; in++) {
            System.out.println("Digite a idade da pessoa " + (in + 1) + ":");
            idades[in] = scanner.nextInt();
            System.out.println("Digite a altura da pessoa " + (in + 1) + ":");
            alturas[in] = scanner.nextDouble();
        }
        
        System.out.println("Idades e alturas na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + ": Idade = " + idades[i] + ", Altura = " + alturas[i]);
        }

        // questão 9

        int[] vetor = new int[10];
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        int somaDosQuadrados = 0;
        for (int i = 0; i < 10; i++) {
            somaDosQuadrados += vetor[i] * vetor[i];
        }
        
        System.out.println("A soma dos quadrados dos elementos do vetor é: " + somaDosQuadrados);

        // questão 10

        int[] vetor1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] vetor2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        int[] vetor3 = new int[20];
        
        for (int i = 0; i < 10; i++) {
            vetor3[i * 2] = vetor1[i];
            vetor3[i * 2 + 1] = vetor2[i];
        }
        
        System.out.println("Terceiro vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor3[i] + " ");
        }








    }
}
