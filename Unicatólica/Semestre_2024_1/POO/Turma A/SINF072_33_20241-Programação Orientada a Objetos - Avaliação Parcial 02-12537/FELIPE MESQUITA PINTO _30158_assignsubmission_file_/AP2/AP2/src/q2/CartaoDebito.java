package q2;

public class CartaoDebito extends FormaPagamento {

	int NumeroDoCartao;
	int CodigoDeSeguranca;
	int DataDeVencimento;
	
	


	public CartaoDebito(int numeroDoCartao, int codigoDeSeguranca,
			int dataDeVencimento) {
		super();
		NumeroDoCartao = numeroDoCartao;
		CodigoDeSeguranca = codigoDeSeguranca;
		DataDeVencimento = dataDeVencimento;
	}


	public int getNumeroDoCartao() {
		return NumeroDoCartao;
	}


	public int getCodigoDeSeguranca() {
		return CodigoDeSeguranca;
	}


	public int getDataDeVencimento() {
		return DataDeVencimento;
	}
	
	
}
