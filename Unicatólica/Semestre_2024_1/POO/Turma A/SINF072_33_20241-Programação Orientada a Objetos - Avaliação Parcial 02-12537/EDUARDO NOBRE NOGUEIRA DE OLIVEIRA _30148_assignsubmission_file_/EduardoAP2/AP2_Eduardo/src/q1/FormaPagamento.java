package q1;

public abstract class FormaPagamento {
	private String tipo;
	private Double valor;
	
	public void imprime(){
		return;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
}
