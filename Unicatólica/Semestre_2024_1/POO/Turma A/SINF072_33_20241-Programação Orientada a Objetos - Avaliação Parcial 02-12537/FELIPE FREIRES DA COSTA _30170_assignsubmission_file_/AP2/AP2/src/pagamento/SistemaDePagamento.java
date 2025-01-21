package pagamento;


import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDePagamento extends FormaPagamento{

	public static void main(String[] args) {
		ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();
		
        formasPagamento.add(new CartaoCredito("2546 8564 2345 5678", "Felipe freires", "250.00", "250,00 "));
        formasPagamento.add(new CartaoDebito("345892382389348989", "50.0", "Felipe freires"));
        formasPagamento.add(new Dinheiro(40.0));
        formasPagamento.add(new Boleto("1234567890123456789012345678901234567890", "Carne. ", 50));
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a forma de pagamento (0-Cartão de Crédito, 1-Cartão de Débito, 2-Dinheiro, 3-Boleto): ");
        int escolha = scanner.nextInt();

        FormaPagamento selectedFormaPagamento = formasPagamento.get(escolha);
        selectedFormaPagamento.efetuarPagamento();
    }

	}


