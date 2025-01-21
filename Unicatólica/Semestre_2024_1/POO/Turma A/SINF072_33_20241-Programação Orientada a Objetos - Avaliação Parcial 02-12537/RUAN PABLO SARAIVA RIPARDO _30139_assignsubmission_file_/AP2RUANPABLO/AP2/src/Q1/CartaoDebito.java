package Q1;

public class CartaoDebito extends FormaPagamento {
	private String numCartao;
	private Integer codseguran�a;
	private String datavalaidade;
	
	public CartaoDebito(String tipo, Double valor, String numCartao,
			Integer codseguran�a, String datavalaidade) {
		super(tipo, valor);
		this.numCartao = numCartao;
		this.codseguran�a = codseguran�a;
		this.datavalaidade = datavalaidade;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public Integer getCodseguran�a() {
		return codseguran�a;
	}

	public void setCodseguran�a(Integer codseguran�a) {
		this.codseguran�a = codseguran�a;
	}

	public String getDatavalaidade() {
		return datavalaidade;
	}

	public void setDatavalaidade(String datavalaidade) {
		this.datavalaidade = datavalaidade;
	}
	
	public void imprimirDetalhes() {
		System.out.printf("Tipo: %s %n Valor: %.2f %n "
				+  "Informa��es do cartao:%n numero do cartao: %s %n"
				+ "Codigo Segurana�a: ***"
				+ "Data Vnecimento %s" , getTipo(), getValor(), getNumCartao(),getDatavalaidade());
	}
	
	
	
	
	

	
	

}
