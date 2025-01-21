package q1;

public class CartaodeCredito extends FormaPagamento{
	
	public CartaodeCredito(String Tipo, double valor, String codSeguranca) {
		super(Tipo, valor);
		this.codSeguraca = codSeguranca;
		// TODO Auto-generated constructor stub
	}
	

	private String codSeguraca;
	
	public String getCodSeguraca() {
		return codSeguraca;
	}
	public void setCodSeguraca(String codSeguraca) {
		this.codSeguraca = codSeguraca;
	}
	
	
	 public String pegarString() {
	        return super.pegarString() + ", Codigo de Segurança : " + this.codSeguraca ;
	    }

	

}























































