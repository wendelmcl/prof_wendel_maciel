package Q1;

import java.time.LocalDate;

public class CartaoCredito extends FormaPagamento {
	private String NumCartao;
	private Integer codSegurança;
	private String DataVencimento;
	
	

	public CartaoCredito(String tipo, Double valor, String numCartao,
			Integer codSegurança, String dataVencimento) {
		super(tipo, valor);
		NumCartao = numCartao;
		this.codSegurança = codSegurança;
		DataVencimento = dataVencimento;
	}
	public String getNumCartao() {
		return NumCartao;
	}
	public void setNumCartao(String numCartao) {
		NumCartao = numCartao;
	}
	public Integer getCodSegurança() {
		return codSegurança;
	}
	public void setCodSegurança(Integer codSegurança) {
		this.codSegurança = codSegurança;
	}
	public String getDataVencimento() {
		return DataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		DataVencimento = dataVencimento;
	}
	
	public void imprimirDetalhes() {
		System.out.printf("Tipo: %s %n Valor: %.2f %n "
				+  "Informações do cartao:%n numero do cartao: %s %n"
				+ "Codigo Seguranaça: ***"
				+ "Data Vnecimento %s" , getTipo(), getValor(), getNumCartao(),getDataVencimento());
				
	
	
	}
}
