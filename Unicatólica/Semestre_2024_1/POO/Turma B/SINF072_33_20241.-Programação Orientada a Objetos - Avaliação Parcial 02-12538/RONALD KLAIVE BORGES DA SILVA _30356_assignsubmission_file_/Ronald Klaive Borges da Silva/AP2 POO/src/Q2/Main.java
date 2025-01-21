package Q2;
import java.util.Scanner;

//Você está desenvolvendo um sistema para um biblioteca. Além de livros, a biblioteca também empresta DVDs. Implemente as interfaces necessárias para representar esta hierarquia. A interface ItemBiblioteca deve conter métodos como emprestarItem() e devolverItem(). Implemente interfaces Livro e DVD que estendem ItemBiblioteca, cada uma contendo métodos adicionais conforme necessário (por exemplo, consultarDisponibilidade() para Livro e gravarDVD() para DVD). Implemente classes concretas LivroImpresso e DVD que implementam as respectivas interfaces. Implemente as interfaces em Java conforme descrito acima e demonstre o uso das classes LivroImpresso e DVD ultilizando os definidos nas interfaces.//

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Biblioteca!");
        System.out.println("Você deseja emprestar um livro ou um DVD?");

        System.out.print("Digite 'L' para livro ou 'D' para DVD: ");
        char opcao = scanner.next().charAt(0);

        ItemBiblioteca item;

        if (opcao == 'L' || opcao == 'l') {
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.next();

            System.out.print("O livro está disponível? (S/N): ");
            char disponivel = scanner.next().charAt(0);

            boolean disponivelBoolean = disponivel == 'S' || disponivel == 's';

            item = new LivroImpresso(disponivelBoolean, titulo);
        } else if (opcao == 'D' || opcao == 'd') {
            System.out.print("Digite o título do DVD: ");
            String titulo = scanner.next();

            System.out.print("O DVD está gravado? (S/N): ");
            char gravado = scanner.next().charAt(0);

            boolean gravadoBoolean = gravado == 'S' || gravado == 's';

            item = new DvdC(gravadoBoolean, titulo);
        } else {
            System.out.println("Opção inválida. Saindo...");
            return;
        }

        System.out.println("Você escolheu: " + item.getClass().getSimpleName());

        while (true) {
            System.out.println("-------------------------------------------------");
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Emprestar item");
            System.out.println("2. Devolver item");
            System.out.println("3. Consultar disponibilidade (somente para livros)");
            System.out.println("4. Gravar DVD (somente para DVDs)");
            System.out.println("5. Sair");
            System.out.println("-------------------------------------------------");

            System.out.print("Digite a opção: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    item.emprestarItem();
                    break;
                case 2:
                    item.devolverItem();
                    break;
                case 3:
                    if (item instanceof Livro) {
                        Livro livro = (Livro) item;
                        System.out.println("-------------------------------------------------");
                        System.out.println("Disponibilidade do livro: " + livro.consultarDisponibilidade());
                        System.out.println("-------------------------------------------------");
                    } else {
                        System.out.println("-------------------------------------------------");
                        System.out.println("Essa opção não é válida para DVDs.");
                        System.out.println("-------------------------------------------------");
                    }
                    break;
                case 4:
                    if (item instanceof DVD) {
                        DVD dvd = (DVD) item;
                        dvd.gravarDVD();
                    } else {
                        System.out.println("-------------------------------------------------");
                        System.out.println("Essa opção não é válida para livros.");
                        System.out.println("-------------------------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Saindo...");
                    System.out.println("-------------------------------------------------");
                    return;
                default:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Opção inválida. Tente novamente.");
                    System.out.println("-------------------------------------------------");
            }
        }
    }
}