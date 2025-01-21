package q1;

public class CartaoCredito extends FormaPagamento {
	private String numeroCartao;
    private String codigoSeguranca;
    private String dataVencimento;
    
    public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void processarPagamento() {
		
    }

    @Override
    public String gerarRecibo() {
        return "Recibo do pagamento com cartão de crédito";
    }

}



