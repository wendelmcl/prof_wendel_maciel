package aula_28_04_2025;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("",0,"");
		Scanner sc = new Scanner(System.in);
		double valor = 0.0;
		String senhaTemporaria = "";
		int opcao = 0;
		System.out.println("Digite o nome do titular da conta: ");
		c1.setTitular(sc.nextLine());
		System.out.println("Número da conta: ");
		c1.setNumeroConta(sc.nextInt());
		System.out.println("Digite sua senha: ");
		c1.setSenha(sc.next());
		
		System.out.println("\nTitular: "+c1.getTitular()+""
				+ "\nNúmero da Conta: " + c1.getNumeroConta()+""
				+ "\nSenha: " + c1.getSenha());
		do {
			System.out.println("\nDigite sua opção: " +""
					+ "\n1 - Depositar: "+""
					+ "\n2 - Sacar: "+""
					+ "\n3 - Exibir saldo"+""
					+ "\n4 - Alterar senha: "+""
					+ "\n0 - Sair");
			opcao = sc.nextInt();
			if(opcao == 1) {
				System.out.println("Digite o valor do depósito: ");
				valor = sc.nextDouble();
				c1.depositar(valor);
			}else if(opcao == 2) {
				System.out.println("Digite o valor de saque: ");
				valor = sc.nextDouble();
				System.out.println("Digite sua senha: ");
				senhaTemporaria = sc.next();
				c1.sacar(valor, senhaTemporaria);
			}else if(opcao == 3) {
				System.out.println("Digite a senha: ");
				senhaTemporaria = sc.next();
				c1.exibirSaldo(senhaTemporaria);
			}else if(opcao == 4) {
				System.out.println("Digite a senha atual: ");
				senhaTemporaria = sc.next();
				System.out.println("Digite a nova senha: ");
				c1.alterarSenha(senhaTemporaria, sc.next());
			}else {
				System.out.println("Opção incorreta.");
			}
			
		}while(opcao != 0);
		System.out.println("\nTitular: "+c1.getTitular()+""
				+ "\nNúmero da Conta: " + c1.getNumeroConta()+""
				+ "\nSaldo: " + c1.getSaldo()+""
				+ "\nSenha: " + c1.getSenha());
	}
}
