package Q1;

import java.util.Scanner;

public class Dinheiro extends FormaPagamento {
	Scanner sc = new Scanner(System.in);
	private int troco;
	
	public void trocoD(double valor){
		System.out.println("Valor a ser pago: "+ valor);
		System.out.println("Precisa de troco para quanto? ");
		double trocoS = sc.nextDouble();
		double trocot= trocoS - valor;
		System.out.println("Troco: "+trocot);
		System.out.println("Compra realizada com sucesso!");
	}

	public int getTroco() {
		return troco;
	}

	public void setTroco(int troco) {
		this.troco = troco;
	}
	
	
	
}
