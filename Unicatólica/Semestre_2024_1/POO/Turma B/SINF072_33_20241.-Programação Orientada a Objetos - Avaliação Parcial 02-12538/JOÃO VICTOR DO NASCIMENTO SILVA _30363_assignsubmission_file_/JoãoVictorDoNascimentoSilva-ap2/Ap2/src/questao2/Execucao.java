package questao2;

import java.util.Scanner;

public class Execucao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LivroImpresso livro1 = new LivroImpresso();
        DVD2 dvd1 = new DVD2();

        System.out.println("Deseja alugar livros ou DVDs? (1 para livros 2 para DVDs)");
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                livro1.consultarDisponibilidade();
                System.out.println("Deseja alugar ou devolver um livro? (1 para alugar 2 para devolver) ");
                resposta = input.nextInt();
                switch (resposta) {
                    case 1:
                        livro1.emprestarItem();
                        break;
                    case 2:
                        livro1.devolverItem();
                        break;
                    default:
                        System.out.println("Valor invalido");
                        break;
                }
            case 2:
                dvd1.gravarDVD();
                System.out.println("Deseja alugar ou devolver um DVD?  (1 para alugar 2 para devolver) ");
                resposta = input.nextInt();
                switch (resposta) {
                    case 1:
                    dvd1.emprestarItem();
                    break;
                    case 2:
                    dvd1.devolverItem();
                    break;
                    default:
                    System.out.println("Valor invalido");
                    break;



             
        }
        
    }
    }
}
