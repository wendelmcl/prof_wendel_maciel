package Q4;

public class Conta {
	private int cod;
	private double saldo;
	
	public void depositar(double valor){
		setSaldo(getSaldo() + valor);
	}
	
	public void sacar(double valor){
		if(getSaldo() - valor >= 0){
			setSaldo(getSaldo() - valor);
		}else{
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public double consultar(){
		return getSaldo();
	}
	
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
