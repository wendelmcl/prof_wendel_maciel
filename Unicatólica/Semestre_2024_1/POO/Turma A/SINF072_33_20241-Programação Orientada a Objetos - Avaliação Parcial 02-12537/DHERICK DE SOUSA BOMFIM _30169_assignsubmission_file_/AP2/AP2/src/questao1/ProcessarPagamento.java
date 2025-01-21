package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcessarPagamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<CartaoCredito> credito = new ArrayList();
		ArrayList<CartaoDebito> debito = new ArrayList();
		ArrayList<Boleto> boleto = new ArrayList();
		ArrayList<Dinheiro> dinheiro = new ArrayList();
		
		CartaoCredito c1 = new CartaoCredito();
		credito.add(c1);
		CartaoDebito d1 = new CartaoDebito();
		debito.add(d1);
		Boleto b1 = new Boleto();
		boleto.add(b1);
		Dinheiro m1 = new Dinheiro();
		dinheiro.add(m1);
		
		
	}

}
