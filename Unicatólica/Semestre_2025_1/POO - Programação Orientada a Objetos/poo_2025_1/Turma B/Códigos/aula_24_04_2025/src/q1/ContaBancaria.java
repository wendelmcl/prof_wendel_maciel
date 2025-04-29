package q1;

public class ContaBancaria {
	private String titular;
	private int numeroConta;
	private double saldo = 0.0;
	private String senha;
	
	ContaBancaria(String titular, int numeroConta, String senha){
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.senha = senha;
	}
	
	public double depositar(double valor) {
		if(valor > 0) {
			saldo = saldo + valor;
			return saldo;
		}
		return saldo;
	}
	
	public double sacar(double valor, String senha) {
		if(this.senha.equals(senha) && saldo >= 0.0 && saldo >= valor) {
			saldo = saldo - valor;
			return saldo;
		}
		System.out.println("Acesso negado");
		return saldo;
	}
	
	public void exibirSaldo(String senha) {
		if(this.senha.equals(senha)) {
			System.out.println("Saldo: " + saldo);
		}else {
			System.out.println("Acesso negado");
		}
	}
	
	public String alterarSenha(String senhaAntiga, String senhaNova) {
		if(this.senha.equals(senhaAntiga)) {
			this.senha = senhaNova;
			return this.senha;
		}
		return this.senha;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
