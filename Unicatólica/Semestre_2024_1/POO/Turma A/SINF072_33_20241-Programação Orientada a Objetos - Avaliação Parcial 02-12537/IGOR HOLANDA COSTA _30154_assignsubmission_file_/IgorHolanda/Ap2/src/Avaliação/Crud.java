package Avalia��o;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud extends FormaPagamento {
	
	ArrayList<FormaPagamento> pagar = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void FormaPagamento(){
		System.out.println("Formas de pagamentos disponiveis: ");
		System.out.println("CC - Cart�o de credito");
		System.out.println("CD - Cart�o de debito");
		System.out.println("B - Boleto bancario");
		System.out.println("D - Dinheiro em especie");
		
	}
	
	public void escolhar(){
		System.out.println("Qual sua forma de pagamento: obs(Se n�o souber as formas disponiveis consulte o comando FormaPagamento)");
		String escolha = sc.next();
		
	}
	
	public void ProcessarPagamento(){
		
		
	}
	

}
