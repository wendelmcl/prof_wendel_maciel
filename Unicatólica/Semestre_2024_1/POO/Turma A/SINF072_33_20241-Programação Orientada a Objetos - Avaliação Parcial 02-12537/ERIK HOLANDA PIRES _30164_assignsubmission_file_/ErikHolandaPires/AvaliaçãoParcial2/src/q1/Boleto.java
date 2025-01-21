package q1;

public class Boleto extends FormaPagamento {
	private String dataVencimento;

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public void processarPagamento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String gerarRecibo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
