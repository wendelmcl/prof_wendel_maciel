package Avaliação;

import java.util.Scanner;

public class Execução {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CartaoCredito cc = new CartaoCredito();
		CartaoDebito cb = new CartaoDebito();
		Boleto b = new Boleto();
		Dinheiro d = new Dinheiro();
		Crud cru = new Crud();
		
		cc.setTipo("C");
		cc.setValor(250);
		cc.setNumeroC(1234);
		
		
	}

}
