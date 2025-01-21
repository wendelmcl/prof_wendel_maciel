package Q1;

import java.util.Scanner;

public class CartaoDebito extends FormaPagamento{
	Scanner sc = new Scanner(System.in);
	private int codigoS, mesVencimento;
	private String numeroCC;
	
	public void cadastroDebito(){
		System.out.println("Digite o numero do cartao: ");
		this.numeroCC = sc.next();
		System.out.println("Digite o codigo de segurança: ");
		this.codigoS = sc.nextInt();
		System.out.println("Digite o mes de vencimento: ");
		this.mesVencimento = sc.nextInt();
		System.out.println("Processando...");
		System.out.println("Cartao cadastrado!");
	}

	

	public String getNumeroCC() {
		return numeroCC;
	}



	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}



	public int getCodigoS() {
		return codigoS;
	}

	public void setCodigoS(int codigoS) {
		this.codigoS = codigoS;
	}

	public int getMesVencimento() {
		return mesVencimento;
	}

	public void setMesVencimento(int mesVencimento) {
		this.mesVencimento = mesVencimento;
	}
	
	
	
}
