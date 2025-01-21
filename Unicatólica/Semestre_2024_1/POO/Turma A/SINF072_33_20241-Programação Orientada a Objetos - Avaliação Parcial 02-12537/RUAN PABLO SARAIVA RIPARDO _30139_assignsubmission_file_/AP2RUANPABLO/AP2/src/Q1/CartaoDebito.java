package Q1;

public class CartaoDebito extends FormaPagamento {
	private String numCartao;
	private Integer codsegurança;
	private String datavalaidade;
	
	public CartaoDebito(String tipo, Double valor, String numCartao,
			Integer codsegurança, String datavalaidade) {
		super(tipo, valor);
		this.numCartao = numCartao;
		this.codsegurança = codsegurança;
		this.datavalaidade = datavalaidade;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public Integer getCodsegurança() {
		return codsegurança;
	}

	public void setCodsegurança(Integer codsegurança) {
		this.codsegurança = codsegurança;
	}

	public String getDatavalaidade() {
		return datavalaidade;
	}

	public void setDatavalaidade(String datavalaidade) {
		this.datavalaidade = datavalaidade;
	}
	
	public void imprimirDetalhes() {
		System.out.printf("Tipo: %s %n Valor: %.2f %n "
				+  "Informações do cartao:%n numero do cartao: %s %n"
				+ "Codigo Seguranaça: ***"
				+ "Data Vnecimento %s" , getTipo(), getValor(), getNumCartao(),getDatavalaidade());
	}
	
	
	
	
	

	
	

}
