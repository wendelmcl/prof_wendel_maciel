package q1;
import java.util.ArrayList;

public class CartaoCredito extends FormaPagamento {
	ArrayList<String> Pagamento = new ArrayList<>();
	private String numCartao;
	private String numSeguranca;
	String vencimento;
	public ArrayList<String> getPagamento() {
		return Pagamento;
	}
	public void setPagamento(ArrayList<String> pagamento) {
		Pagamento = pagamento;
	}
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getNumSeguranca() {
		return numSeguranca;
	}
	public void setNumSeguranca(String numSeguranca) {
		this.numSeguranca = numSeguranca;
	}
	public String getVencimento() {
		return vencimento;
	}
	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
}