package Q4;

public class Conta {
	private String nome;
	private int numero;
	private double saldo = 1000.00;
	
	public void contaDeposito(double quantidadeD){
		saldo = saldo + quantidadeD;
		System.out.println("Saldo atual: "+saldo);
	}
	
	public void contaSaque(double quantidadeS){
		saldo = saldo - quantidadeS;
		System.out.println("Saldo atual: "+saldo);
	}
	
	public double consultar(){
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
}
