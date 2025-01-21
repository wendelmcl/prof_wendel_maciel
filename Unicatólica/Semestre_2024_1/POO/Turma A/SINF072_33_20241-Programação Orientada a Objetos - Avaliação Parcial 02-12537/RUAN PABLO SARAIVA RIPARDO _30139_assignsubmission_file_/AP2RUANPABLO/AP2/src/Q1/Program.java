package Q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<FormaPagamento> pagamentos = new ArrayList();
		System.out.println("Sistema de pagamentos");
		
		System.out.println("Digite a forma de Pagamento que deseja: ");
		System.out.println("1-Cartao de Credito 2-Boleto 3-CartaoDebito 4-Dinheiro 5-sair");
		int opcao = sc.nextInt();
		
		while(opcao != 5) {
			switch (opcao) {
			case 1:
				System.out.println("Digite o numero do cartao:");
				String NumCartao = sc.next();
				System.out.println("Digite o codigo de segurança:");
				Integer codsegurança = sc.nextInt();
				System.out.println("Digite a data de validade:  ex:(08/28)");
				String dataValidade = sc.next();
				
				System.out.println("Digite o valor da Conta:");
				Double value = sc.nextDouble();
				
				CartaoCredito credito = new CartaoCredito("Cartao De Credito", value,NumCartao,codsegurança,dataValidade);
				
				credito.imprimirDetalhes();
				System.out.println("Digite uma nova opcao de operação");
				opcao = sc.nextInt();
				break;
			
			case 2:
				System.out.println("Digite a data de vencimento do boleto ex:25/10/2025");
				String datavencimento = sc.next();
				System.out.println("Digite o valor:");
				Double valor = sc.nextDouble();
				
				Boleto boleto = new Boleto("Boleto",valor,datavencimento);
				boleto.imprimirDetalhes();
				System.out.println("Digite uma nova opcao de operação");
				opcao = sc.nextInt();
				break;
				
			case 3:
				System.out.println("Digite o numero do cartao:");
				String NumCartaoDebito = sc.next();
				System.out.println("Digite o codigo de segurança:");
				Integer codsegurançaDebito = sc.nextInt();
				System.out.println("Digite a data de validade:  ex:(08/28)");
				String dataValidadeDebito = sc.next();
				
				System.out.println("Digite o valor da Conta:");
				Double valorr = sc.nextDouble();
				
				CartaoDebito debito = new CartaoDebito("Cartao De Debito", valorr,NumCartaoDebito,codsegurançaDebito,dataValidadeDebito);
				debito.imprimirDetalhes();
				System.out.println("Digite uma nova opcao de operação");
				opcao = sc.nextInt();
				
				break;
				
			case 4:
				
				System.out.println("Digite o valor da conta:");
				Double valuee = sc.nextDouble();
				System.out.println("Digite o valor que possue:");
				Double quantiaEmMaos = sc.nextDouble();
				
				Dinheiro dinheiro = new Dinheiro("Dinheiro:", valuee, quantiaEmMaos);
				dinheiro.imprimirDetalhes();
				System.out.println("Digite uma nova opcao de operação");
				opcao = sc.nextInt();
			
				break;
			case 5:
				break;
			}
			
			
			}
		}
	}


