package primeiraquestão;

public abstract class FormaPagamento1 {
	private int credito;
	private int debito;
	private int Boleto;
	private int dinheiro;
	public int getCredito() {
		return credito;
	}
	public void setCredito(int credito) {
		this.credito = credito;
	}
	public int getDebito() {
		return debito;
	}
	public void setDebito(int debito) {
		this.debito = debito;
	}
	public int getBoleto() {
		return Boleto;
	}
	public void setBoleto(int boleto) {
		Boleto = boleto;
	}
	public int getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	

}
