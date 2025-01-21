package questao1;

public class CartaoDebito  extends FormaPagamento{
	
	private int numCartao;
	private int codseguranca;
	private String dateVencimento;
	
	public int getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}
	public int getCodseguranca() {
		return codseguranca;
	}
	public void setCodseguranca(int codseguranca) {
		this.codseguranca = codseguranca;
	}
	public String getDateVencimento() {
		return dateVencimento;
	}
	public void setDateVencimento(String dateVencimento) {
		this.dateVencimento = dateVencimento;
	}
	
	

}
