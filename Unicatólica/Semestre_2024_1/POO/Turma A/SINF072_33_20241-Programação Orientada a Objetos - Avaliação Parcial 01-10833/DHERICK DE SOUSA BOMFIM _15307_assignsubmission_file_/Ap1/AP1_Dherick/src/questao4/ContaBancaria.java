package questao4;

public class ContaBancaria {
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
	
	public static float deposito(float saldo, float dep){
		dep = saldo + dep;
		return saldo;
	}
	public static float sacar(float saldo, float saque){
		saque = saldo - saque;
		return saldo;
	}
	public static float consulta(float saldo){
		return saldo;
	}
	
}
