package Questao4;

public class Usuario {

	int id;
	double saldo, deposito, saque;

	Usuario() {

	}

	Usuario(int id, double saldo, double deposito, double saque) {
		id = this.id;
		saldo = this.saldo;
		deposito = this.deposito;
		saque = this.saque;

	}

	String consultarSaldo() {
		return String.format("%d", saldo);
	}

	double sacar() {
		return saque - saldo;

	}

	double depositar() {
		return saldo + deposito;

	}

}
