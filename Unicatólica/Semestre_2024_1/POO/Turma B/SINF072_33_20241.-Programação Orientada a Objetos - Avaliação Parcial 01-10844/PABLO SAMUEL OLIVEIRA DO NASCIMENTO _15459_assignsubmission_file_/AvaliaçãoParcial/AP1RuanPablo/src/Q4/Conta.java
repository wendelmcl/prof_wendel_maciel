package Q4;

public class Conta {
	private int NumConta;
	private Double saldo;
	
	
	public int getNumConta() {
		return NumConta;
	}
	public void setNumConta(int numConta) {
		NumConta = numConta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void VerificarSaldo() {
		System.out.printf("O dinheiro em conta é %.2f %n" , this.saldo);
	}
	
	public void Deposito(Double amount) {
		saldo += amount;
	}
	
	public void saque(Double amount) {
		saldo -= amount;
	}
	
	
	
	

}
