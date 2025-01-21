package pagamento ;

public class CartaoCredito extends FormaPagamento{
	private String numeroCartao;
	private String nome;
	private String dataVencimento;
	private String valor;

    public CartaoCredito(String numeroCartao, String nome, String dataVencimento, String valor) {
        this.numeroCartao = numeroCartao;
        this.nome = nome;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
    }

    public void efetuarPagamento() {
       System.out.println("Pagamento de R$: " + valor + "realizado com cartão de crédito. Número do cartão: " + numeroCartao + " Nome do Cliente: " + nome);
    }
}
	

