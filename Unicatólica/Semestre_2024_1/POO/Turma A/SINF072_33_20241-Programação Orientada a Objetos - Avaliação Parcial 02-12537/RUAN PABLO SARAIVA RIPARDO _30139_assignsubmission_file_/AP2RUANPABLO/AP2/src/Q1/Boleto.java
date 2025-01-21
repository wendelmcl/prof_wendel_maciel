package Q1;

import java.time.LocalDate;

public class Boleto extends FormaPagamento {
	private String dataVencimento;
	
	

	public Boleto(String tipo, Double valor, String dataVencimento) {
		super(tipo, valor);
		this.dataVencimento = dataVencimento;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public void imprimirDetalhes() {
		System.out.printf("Tipo: %s %n Valor: %.2f %n "
				+ "Data vencimento: %s" , getTipo(),getValor(),getDataVencimento());
	
	}
	

}
