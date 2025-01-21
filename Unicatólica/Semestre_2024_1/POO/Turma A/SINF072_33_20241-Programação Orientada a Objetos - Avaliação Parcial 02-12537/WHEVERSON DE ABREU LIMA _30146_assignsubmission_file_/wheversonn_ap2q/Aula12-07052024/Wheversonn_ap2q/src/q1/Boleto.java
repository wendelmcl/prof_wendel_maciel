package q1;

public class Boleto extends FormaPagamento{
	

	private String Vencimento;

	public Boleto(String Tipo, double valor, String Vencimento) {
		super(Tipo, valor);
		this.Vencimento = Vencimento;
		// TODO Auto-generated constructor stub
	}
	public String getVencimento() {
		return Vencimento;
	}

	public void setVencimento(String vencimento) {
		Vencimento = vencimento;
	}
	
	 public String pegarString() {
	        return super.pegarString() +", Vencimento : " + Vencimento;
	    }
	
	
	
	
	
	
	
	

}
