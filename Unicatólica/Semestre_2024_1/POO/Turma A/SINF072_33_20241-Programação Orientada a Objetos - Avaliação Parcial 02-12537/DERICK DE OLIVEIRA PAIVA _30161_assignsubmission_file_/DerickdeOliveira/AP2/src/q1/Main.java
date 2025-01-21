package q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		ArrayList<FormaPagamento> formas = new ArrayList<FormaPagamento>();
		
		while(true) {
			System.out.println("Qual o valor a ser pago?");
			double valor = sc.nextDouble();
			System.out.println("Selecione a forma de pagamento:");
			System.out.println("1. Cartão de Credito");
			System.out.println("2. Cartão de Débito");
			System.out.println("3. Boleto");
			System.out.println("4. Dinheiro");
			int opcao = sc.nextInt();
			
			switch(opcao){
			case 1:
				System.out.println("Qual o número do cartão de crédito? ");
				String numerocartao = sc.next();
				System.out.println("");
				System.out.println("Qual o código de segurança? ");
				String codigoseguranca = sc2.next();
				CartaoCredito c1 = new CartaoCredito("Cartão de Credito",valor, numerocartao, codigoseguranca);
				formas.add(c1);
				break;
			case 2:
				System.out.println("Qual o número do cartão de debito? ");
				String numerocartaod = sc.next();
				System.out.println("");
				System.out.println("Qual o código de segurança? ");
				String codigosegurancad = sc2.next();
				CartaoDebito d1 = new CartaoDebito("Cartão de debito",valor, numerocartaod, codigosegurancad);
				formas.add(d1);
				break;
			case 3:
				System.out.println("Qual a data de vencimento ");
				String datavencer = sc.next();
				
				Boleto b1 = new Boleto("Boleto",valor, datavencer);
				formas.add(b1);
				break;
			case 4:
				System.out.println("Quantas cedulas? ");
				int cedula = sc.nextInt();
				Dinheiro di1 = new Dinheiro("Dinheiro", valor, cedula);
				formas.add(di1);
				break;
			case 5:
				System.out.println("Saindo...");
				return;
			}
			
			System.out.println("Deseja ver as formas de pagamento adicionadas e recibos? ");
			System.out.println("1. Sim e 2. Não");
			int opcao2 = sc.nextInt();
			if(opcao2 == 1){
				for(FormaPagamento FormaPagamento : formas){
					System.out.println(FormaPagamento);
				}
			
			} else {
				System.out.println("Saindo...");
				sc.close();
				sc2.close();
				return;
			}
			
				
			}
			
				
				
			
		}
		
	}


