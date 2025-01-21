package q1;

public abstract class FormaPagamento {
	private int cartaocred;
	private int cartaodeb;
	private int boleto;
	private int dinheiro;
	private double valor;
	
	public int getCartaocred() {
		return cartaocred;
	}
	public void setCartaocred(int cartaocred) {
		this.cartaocred = cartaocred;
	}
	public int getCartaodeb() {
		return cartaodeb;
	}
	public void setCartaodeb(int cartaodeb) {
		this.cartaodeb = cartaodeb;
	}
	public int getBoleto() {
		return boleto;
	}
	public void setBoleto(int boleto) {
		this.boleto = boleto;
	}
	public int getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
