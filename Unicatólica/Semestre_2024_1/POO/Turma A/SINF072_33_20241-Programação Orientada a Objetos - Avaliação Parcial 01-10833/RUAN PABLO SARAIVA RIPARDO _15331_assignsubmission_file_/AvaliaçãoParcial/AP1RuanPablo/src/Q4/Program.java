package Q4;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta conta = new Conta();
		System.out.println("Criação De conta");
		System.out.println("Digite o numero da conta:");
		conta.setNumConta(sc.nextInt());
		
		System.out.println("Digite o saldo na conta:");
		conta.setSaldo(sc.nextDouble());
		
		conta.VerificarSaldo();
		
		System.out.println("Digite um valor para realizar um deposito:");
		conta.Deposito(sc.nextDouble());
		
		conta.VerificarSaldo();
		
		System.out.println("Digite um valor de saque:");
		conta.saque(sc.nextDouble());
		
		conta.VerificarSaldo();
	}

}
