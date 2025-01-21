package Quest1;

public abstract class FormaPagamento extends CartaoCredito {
	private int cartaoCredito;
	private int cartaoDebito;
	private int dinheiro;
	private int valor;
	
	
	public int getCartaoCredito() {
		return cartaoCredito;
	}
	public void setCartaoCredito(int cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	public int getCartaoDebito() {
		return cartaoDebito;
	}
	public void setCartaoDebito(int cartaoDebito) {
		this.cartaoDebito = cartaoDebito;
	}
	public int getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

	public void cartaoCredito(){
		System.out.println("numero do cartao: " + this.getNumeroDoCartao());
		System.out.println("codigo cvv: " + this.getCodigo());
		System.out.println("Data: : " + this.getData());
		
	}
	public void cartaoDebito(){
		System.out.println("numero do cartao: " + this.getNumeroDoCartao());
		System.out.println("codigo cvv: " + this.getCodigo());
		System.out.println("Data: : " + this.getData());
	}
}
