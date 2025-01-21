package questao1;

public abstract class FormaPagamento {
	private String tipo;
	private float valor;
	
	public abstract void gerarRecibo();
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
