package q1;

public class Dinheiro extends FormaPagamento{
	private int codPagamento;

	public Dinheiro(String Tipo, double valor, int codPagamento) {
		super(Tipo, valor);
		this.codPagamento = codPagamento;
		// TODO Auto-generated constructor stub
	}

	public int getCodPagamento() {
		return codPagamento;
	}

	public void setCodPagamento(int codPagamento) {
		this.codPagamento = codPagamento;
	}

	
	 public String pegarString() {
	        return super.pegarString() +", Codigo do Pagamento : " + codPagamento ;
	    }
		
	}
	
	

