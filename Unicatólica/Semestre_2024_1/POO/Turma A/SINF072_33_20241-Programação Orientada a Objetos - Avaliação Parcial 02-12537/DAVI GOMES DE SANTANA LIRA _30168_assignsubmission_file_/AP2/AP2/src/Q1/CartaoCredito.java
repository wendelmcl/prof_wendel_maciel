package Q1;

import java.util.Scanner;

public class CartaoCredito extends FormaPagamento{
	Scanner sc = new Scanner(System.in);
	private int parcelas, codigoS, mesVencimento;
	private String numeroCC;
	
	public void cadastroCartao() {
		System.out.println("Digite o numero do cartão: ");
		this.numeroCC = sc.next();
		System.out.println("Digite o codigo de segurança: ");
		this.codigoS = sc.nextInt();
		System.out.println("Digite o mes de vencimento: ");
		this.mesVencimento = sc.nextInt();
		System.out.println("Quantidade de parcelas: ");
		this.parcelas = sc.nextInt();
		System.out.println("Processando...");
		System.out.println("Cartão cadastrado!");
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public int getCodigoS() {
		return codigoS;
	}

	public void setCodigoS(int codigoS) {
		this.codigoS = codigoS;
	}

	public String getNumeroCC() {
		return numeroCC;
	}

	public void setNumeroCC(String numeroCC) {
		this.numeroCC = numeroCC;
	}

	public int getMesVencimento() {
		return mesVencimento;
	}

	public void setMesVencimento(int mesVencimento) {
		this.mesVencimento = mesVencimento;
	}
	
	
	
}
