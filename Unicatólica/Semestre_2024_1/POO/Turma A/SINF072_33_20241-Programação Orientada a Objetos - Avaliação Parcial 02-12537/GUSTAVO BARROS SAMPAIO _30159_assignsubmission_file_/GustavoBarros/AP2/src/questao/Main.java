package questao;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a forma de pagamento selecionada: \n 1 - Cartão Crédito \n 2 - Cartão Débito \n 3 - Boleto \n 4 - Dinheiro");
		int escolha = (entrada.nextInt());

		if (escolha == 1) {
			CartaoCredito c1 = new CartaoCredito();
			System.out.println("Digite o número do cartão: ");
			c1.setNumeroCartao(entrada.nextInt());
			System.out.println("Digite o código de segurança: ");
			c1.setCodigoSeguranca(entrada.nextInt());
			System.out.println("Digite o valor a ser pago: ");
			c1.setValor(entrada.nextInt());
			System.out.println("Digite o valor pago: ");
			c1.setValorPago(entrada.nextInt());
			c1.pagamentoCredito();
			if (c1.getValorPago() < c1.getValor()) {
				System.out.println("Pagamento falhou!");
			} else {
				System.out.println("Pagamento efetuado com sucesso!");
				c1.pagamentoCredito();
			}

		} else if (escolha == 2) {
			CartaoDebito c2 = new CartaoDebito();
			System.out.println("Digite os números do cartão: ");
			c2.setNumeroCartao(entrada.nextInt());
			System.out.println("Digite o código de segurança: ");
			c2.setCodigoSeguranca(entrada.nextInt());
			System.out.println("Digite o valor a ser pago: ");
			c2.setValor(entrada.nextInt());
			System.out.println("Digite o valor pago: ");
			c2.setValorPago(entrada.nextInt());
			c2.pagamentoDebito();
			if (c2.getValorPago() < c2.getValor()) {
				System.out.println("Pagamento falhou!");
			} else {
				System.out.println("Pagamento efetuado com sucesso!");
			}
		} else if (escolha == 3) {
			Boleto b1 = new Boleto();
			System.out.println("Digite o valor a ser pago: ");
			b1.setValor(entrada.nextInt());
			System.out.println("O valor que será pago: ");
			b1.setValorPago(entrada.nextInt());
			b1.pagamentoBoleto();
			if (b1.getValorPago() < b1.getValor()){
				System.out.println("Dinheiro insuficiente!");
			}
		} else if (escolha == 4) {
			Dinheiro d1 = new Dinheiro();
			System.out.println("Digite o valor a ser pago: ");
			d1.setValor(entrada.nextInt());
			System.out.println("O valor que será pago é: ");
			d1.setValorPago(entrada.nextInt());
			d1.pagamentoDinheiro();
			if(d1.getValorPago() < d1.getValor()){
				System.out.println("Dinheiro insuficiente");
			}
		}

		entrada.close();

	}

}
