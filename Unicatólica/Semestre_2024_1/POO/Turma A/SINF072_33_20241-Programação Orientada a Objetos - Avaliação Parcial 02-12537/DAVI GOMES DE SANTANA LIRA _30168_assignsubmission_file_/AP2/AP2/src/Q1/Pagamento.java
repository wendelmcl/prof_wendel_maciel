package Q1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Pagamento {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double valor = 150.0;
		Boleto boleto = new Boleto();
		CartaoCredito credito = new CartaoCredito(); 
		CartaoDebito debito = new CartaoDebito();
		Dinheiro dinheiro = new Dinheiro();
		
		System.out.println("1- CREDITO");
		System.out.println("2- DEBITO");
		System.out.println("3- DINHEIRO");
		System.out.println("4- BOLETO");
		System.out.print("R:");
		int opcao = sc.nextInt();
		
		switch (opcao){
		case 1:
			credito.cadastroCartao();
			System.out.println("Deseja fazer o pagamento? 1- sim   2- nao");
			int resp = sc.nextInt();
			if(resp == 1){
				System.out.println("Pagamento sendo realizado...");
				System.out.println("PAGAMENTO REALIZADO!");
				System.out.println("COMPRA CREDITO NO VALOR: "+ valor + " REALIZADA!" + " via Nubank." );
				break;
				}else{
					System.out.println("Compra cancelada.");
					break;
				}
		case 2:
			debito.cadastroDebito();
			System.out.println("Deseja fazer o pagamento? 1- sim   2- nao");
			int respD = sc.nextInt();
			if(respD == 1){
				System.out.println("Pagamento sendo realizado...");
				System.out.println("PAGAMENTO REALIZADO!");
				System.out.println("COMPRA DEBITO NO VALOR: "+ valor + " REALIZADA!" + " via Nubank." );
				break;
				}else{
					System.out.println("Compra cancelada.");
					break;
				}
		case 3:
			dinheiro.trocoD(valor);
			break;
		case 4:
			boleto.pagamentoBoleto(valor);
			break;
		}
		
		
	}
}
