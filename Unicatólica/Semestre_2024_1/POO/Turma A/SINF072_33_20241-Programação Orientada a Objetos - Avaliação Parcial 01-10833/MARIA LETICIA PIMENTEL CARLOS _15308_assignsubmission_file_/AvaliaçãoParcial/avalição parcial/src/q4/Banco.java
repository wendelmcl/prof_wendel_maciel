package q4;

public class Banco {
 private int NumeroConta;
 private double saldo;
 
 public double depositar(double deposito){
	 
	 saldo+= deposito;
	 System.out.println("VOC� DEPOSITOU R$" + deposito + " NA SUA CONTA!");
	return saldo; 
 }
 
public double saque(double saque){
	 
	 saldo-= saque;
	 System.out.println("VOC� SACOU R$" + saque + " DA SUA CONTA!");
	return saldo; 
 }

public void consulta(){
	 
	System.out.println("VALOR TOTAL : R$"+saldo); 
}

public int getNumeroConta() {
	return NumeroConta;
}

public void setNumeroConta(int numeroConta) {
	NumeroConta = numeroConta;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}
	
	
}
