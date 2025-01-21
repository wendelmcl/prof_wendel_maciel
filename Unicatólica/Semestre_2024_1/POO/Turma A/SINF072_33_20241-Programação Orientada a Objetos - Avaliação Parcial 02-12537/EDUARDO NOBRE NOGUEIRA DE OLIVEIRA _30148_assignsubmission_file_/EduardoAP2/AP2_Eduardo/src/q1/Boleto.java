package q1;

public class Boleto extends FormaPagamento{
	private int cod_boleto;
	private String cpf_cliente, nome_cliente;
	public void imprime(){
		System.out.println("tipo: " + getTipo());
		System.out.println("Valor: "+ getValor());
		System.out.println("Codigo do Boleto: " + this.cod_boleto);
		System.out.println("CPF: " + this.cpf_cliente);
		System.out.println("Nome Cliente: " + this.nome_cliente);
		System.out.println("----------------------------");
	}
	
	public int getCod_boleto() {
		return cod_boleto;
	}

	public void setCod_boleto(int cod_boleto) {
		this.cod_boleto = cod_boleto;
	}

	public String getCpf_cliente() {
		return cpf_cliente;
	}

	public void setCpf_cliente(String cpf_cliente) {
		this.cpf_cliente = cpf_cliente;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	
	
	
}
