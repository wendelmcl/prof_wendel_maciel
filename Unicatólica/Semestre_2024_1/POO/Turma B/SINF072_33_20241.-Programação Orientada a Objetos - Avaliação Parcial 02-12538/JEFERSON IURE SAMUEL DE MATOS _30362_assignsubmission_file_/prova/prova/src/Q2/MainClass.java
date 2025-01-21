package Q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // Criar lista de livros impressos disponíveis
        List<LivroImpressoClass> livrosDisponiveis = new ArrayList<>();
        livrosDisponiveis.add(new LivroImpressoClass(true));
        livrosDisponiveis.add(new LivroImpressoClass(true));
        livrosDisponiveis.add(new LivroImpressoClass(false));

        // Criar lista de DVDs disponíveis
        List<DVDClass> dvdsDisponiveis = new ArrayList<>();
        dvdsDisponiveis.add(new DVDClass(false));
        dvdsDisponiveis.add(new DVDClass(true));
        dvdsDisponiveis.add(new DVDClass(false));

        // Mostrar lista de livros e DVDs disponíveis
        System.out.println("Livros impressos disponíveis:");
        for (int i = 0; i < livrosDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + (livrosDisponiveis.get(i).consultarDisponibilidade() ? "Disponível" : "Indisponível"));
        }

        System.out.println("DVDs disponíveis:");
        for (int i = 0; i < dvdsDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + (dvdsDisponiveis.get(i).gravado ? "Gravado" : "Não gravado"));
        }

        // Solicitar ao usuário que escolha um item para emprestar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do item que deseja emprestar (ou 0 para sair): ");
        int escolha = scanner.nextInt();

        if (escolha == 0) {
            System.out.println("Saindo do sistema...");
            return;
        }

        // Verificar se o item escolhido é um livro ou um DVD
        if (escolha <= livrosDisponiveis.size()) {
            LivroImpressoClass livroEscolhido = livrosDisponiveis.get(escolha - 1);
            if (livroEscolhido.consultarDisponibilidade()) {
                livroEscolhido.emprestarItem();
            } else {
                System.out.println("Livro não está disponível para empréstimo.");
            }
        } else if (escolha <= livrosDisponiveis.size() + dvdsDisponiveis.size()) {
            DVDClass dvdEscolhido = dvdsDisponiveis.get(escolha - livrosDisponiveis.size() - 1);
            dvdEscolhido.emprestarItem();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}