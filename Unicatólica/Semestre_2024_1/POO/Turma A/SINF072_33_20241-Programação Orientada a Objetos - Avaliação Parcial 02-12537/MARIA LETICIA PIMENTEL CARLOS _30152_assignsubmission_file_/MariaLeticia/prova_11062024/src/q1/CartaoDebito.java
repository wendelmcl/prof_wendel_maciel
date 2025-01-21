package q1;

public class CartaoDebito extends FormaPagamento{
	

	private int nCartao;

	public CartaoDebito(String Tipo, double valor, int nCartao) {
		super(Tipo, valor);
		this.nCartao = nCartao;
		// TODO Auto-generated constructor stub
	}

	public int getnCartao() {
		return nCartao;
	}

	public void setnCartao(int nCartao) {
		this.nCartao = nCartao;
	}
	
	 public String pegarString() {
	        return super.pegarString() +", Numero do Cartao:  " + nCartao ;
	    }
	
	
	

}
