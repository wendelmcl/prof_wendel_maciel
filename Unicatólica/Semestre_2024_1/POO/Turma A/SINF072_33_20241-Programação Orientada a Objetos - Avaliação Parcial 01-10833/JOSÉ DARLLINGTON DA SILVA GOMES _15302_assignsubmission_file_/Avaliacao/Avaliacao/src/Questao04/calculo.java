package Questao04;

import java.util.Scanner;


public class calculo {

	public static void main(String[] args) {
		ContaBancaria Conta = new ContaBancaria();
		int acao = 0, valor = 0;
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Insira o código da conta: ");
		Conta.setCodigo(leitor.nextInt());
		
		
		System.out.print("Insira o saldo da conta: ");
		Conta.setSaldo(leitor.nextInt());
		
		
		System.out.print("Insira um número para ação: 0 - Nada, 1 - Depositar, 2 - Sacar Dinheiro e 3 - Verificar o saldo ");
		acao = leitor.nextInt();
		while(acao != 0) {
			if(acao == 1) {
				System.out.print("Quanto deseja depositar?");
				valor = leitor.nextInt();
				Conta.setSaldo(Conta.getSaldo() + valor);
				System.out.println("Agora você possui: " + Conta.getSaldo());
				System.out.println("O que você deseja fazer agora? ");
				System.out.println("Insira um número para ação: 0 - Nada, 1 - Depositar, 2 - Sacar Dinheiro e 3 - Verificar o saldo ");
				acao = leitor.nextInt();
			}
			if(acao == 2) {
				System.out.print("Quanto deseja sacar?");
				valor = leitor.nextInt();
				Conta.setSaldo(Conta.getSaldo() - valor);
				System.out.println("Agora você possui: " + Conta.getSaldo());
				System.out.println("O que você deseja fazer agora? ");
				System.out.println("Insira um número para ação: 0 - Nada, 1 - Depositar, 2 - Sacar Dinheiro e 3 - Verificar o saldo ");
				acao = leitor.nextInt();
			}
			if (acao == 3) {
				System.out.println("Agora você possui: " + Conta.getSaldo());
				System.out.println("O que você deseja fazer agora? ");
				System.out.println("Insira um número para ação: 0 - Nada, 1 - Depositar, 2 - Sacar Dinheiro e 3 - Verificar o saldo ");
				acao = leitor.nextInt();
			}
		} leitor.close();

		
	}

	

}
