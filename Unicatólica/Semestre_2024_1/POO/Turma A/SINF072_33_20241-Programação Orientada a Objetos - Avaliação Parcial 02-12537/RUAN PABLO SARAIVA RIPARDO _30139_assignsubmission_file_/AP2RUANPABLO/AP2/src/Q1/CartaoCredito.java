package Q1;

import java.time.LocalDate;

public class CartaoCredito extends FormaPagamento {
	private String NumCartao;
	private Integer codSeguran�a;
	private String DataVencimento;
	
	

	public CartaoCredito(String tipo, Double valor, String numCartao,
			Integer codSeguran�a, String dataVencimento) {
		super(tipo, valor);
		NumCartao = numCartao;
		this.codSeguran�a = codSeguran�a;
		DataVencimento = dataVencimento;
	}
	public String getNumCartao() {
		return NumCartao;
	}
	public void setNumCartao(String numCartao) {
		NumCartao = numCartao;
	}
	public Integer getCodSeguran�a() {
		return codSeguran�a;
	}
	public void setCodSeguran�a(Integer codSeguran�a) {
		this.codSeguran�a = codSeguran�a;
	}
	public String getDataVencimento() {
		return DataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		DataVencimento = dataVencimento;
	}
	
	public void imprimirDetalhes() {
		System.out.printf("Tipo: %s %n Valor: %.2f %n "
				+  "Informa��es do cartao:%n numero do cartao: %s %n"
				+ "Codigo Segurana�a: ***"
				+ "Data Vnecimento %s" , getTipo(), getValor(), getNumCartao(),getDataVencimento());
				
	
	
	}
}
