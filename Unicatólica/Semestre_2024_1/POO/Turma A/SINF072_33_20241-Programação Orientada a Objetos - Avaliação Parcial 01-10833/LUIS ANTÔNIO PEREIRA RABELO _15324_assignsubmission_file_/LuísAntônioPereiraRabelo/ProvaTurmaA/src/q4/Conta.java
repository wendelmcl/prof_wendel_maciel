package q4;

public class Conta {
	private int id;
	private double saldo;

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double Depositar(double deposito){
		System.out.println("Deposito concluido");
		return saldo + deposito;
	}
	
	public double Sacar(double saque){
		if(saldo == 0){
			System.out.println("Sem saldo para sacar");
		}else{
			System.out.println("Saque concluido");
		}
		return saldo - saque;
	}
	public void Consulta(){
		System.out.println("Saldo: " + saldo);
	}
}
