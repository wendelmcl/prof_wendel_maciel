package primeiraquestão;
import java.util.ArrayList;
import java.util.Scanner;

class FormaPagamento {
    String nome;

    public FormaPagamento(String nome) {
        this.nome = nome;
    }

    
}

public class SistemaPagamento {
    public static void main(String[] args) {
        
        ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();
        formasPagamento.add(new FormaPagamento("Dinheiro"));
        formasPagamento.add(new FormaPagamento("Cartão de Crédito"));
        formasPagamento.add(new FormaPagamento("Cartão de Débito"));
        formasPagamento.add(new FormaPagamento("Boleto"));
        formasPagamento.add(new FormaPagamento("Dinheiro"));
        
      
        System.out.println("Formas de pagamento disponíveis:");
        for (int i = 0; i < formasPagamento.size(); i++) {
            System.out.println((i + 1) + ". " + formasPagamento.get(i).nome);
        }

       
        System.out.print("Escolha a forma de pagamento: ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

      
        if (escolha >= 1 && escolha <= formasPagamento.size()) {
            FormaPagamento formaEscolhida = formasPagamento.get(escolha - 1);
            System.out.println("Você escolheu pagar com " + formaEscolhida.nome);
   
        } else {
            System.out.println("Opção inválida.");
        }
    }
}
