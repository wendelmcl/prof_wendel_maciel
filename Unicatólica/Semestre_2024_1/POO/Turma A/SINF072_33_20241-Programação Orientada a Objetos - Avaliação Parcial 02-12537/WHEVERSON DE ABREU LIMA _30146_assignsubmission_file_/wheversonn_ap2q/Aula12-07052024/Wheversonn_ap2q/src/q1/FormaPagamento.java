package q1;

public abstract class FormaPagamento {
	private String Tipo;
	private double valor;
	
	 public FormaPagamento(String Tipo,  double valor) {
	        this.Tipo = Tipo;
	        this.valor = valor;
	        
	    }
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	 public String pegarString() {
	        return "Tipo " + Tipo + ", Valor " + valor ;
	    }
	
	
}



































