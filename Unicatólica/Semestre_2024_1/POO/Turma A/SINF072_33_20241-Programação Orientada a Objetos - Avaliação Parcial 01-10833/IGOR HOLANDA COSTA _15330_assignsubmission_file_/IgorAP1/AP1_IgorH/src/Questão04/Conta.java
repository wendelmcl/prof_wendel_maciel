package Questão04;

public class Conta {
	private int id;
	private float saldo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float depositar(double d) {
		saldo += d;
		return saldo;
	}
	public void sacar(float saca) {
		saldo -= saca;
		return;
	}
	public float consultar(float saldo) {
		return saldo;
	}

}
