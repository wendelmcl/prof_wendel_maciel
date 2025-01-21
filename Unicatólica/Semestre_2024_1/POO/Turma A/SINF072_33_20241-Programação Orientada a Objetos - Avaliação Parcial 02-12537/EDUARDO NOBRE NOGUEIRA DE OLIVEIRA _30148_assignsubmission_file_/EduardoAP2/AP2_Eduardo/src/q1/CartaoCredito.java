package q1;

import java.util.ArrayList;

public class CartaoCredito extends FormaPagamento {
	private int num_cartao, cvv;
	private String data_venc;
	
	public void imprime(){
		System.out.println("tipo: " + getTipo());
		System.out.println("Valor: "+ getValor());
		System.out.println("Numero Cartao: " + this.num_cartao);
		System.out.println("Data Vencimento: " + this.data_venc);
		System.out.println("CVV: " + this.cvv);
		System.out.println("----------------------------");
	}
	
	public int getNum_cartao() {
		return num_cartao;
	}
	public void setNum_cartao(int num_cartao) {
		this.num_cartao = num_cartao;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getData_venc() {
		return data_venc;
	}
	public void setData_venc(String data_venc) {
		this.data_venc = data_venc;
	}
	
}
