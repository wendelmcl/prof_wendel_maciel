package Q4;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double quantidadeD = 0;
		double quantidadeS = 0;
		Conta conta = new Conta();
		
		System.out.println("Digite seu nome: ");
		conta.setNome(sc.next());
		System.out.println("Digite o numero da sua conta: ");
		conta.setNumero(sc.nextInt());
		System.out.println("Digite a ação que deseja: 1- Saque 2- Deposito");
		int opcao = sc.nextInt();
		
		switch(opcao){
		case 1:
			System.out.println("Digite o valor do saque a ser feito: ");
			quantidadeS = sc.nextInt();
			conta.contaSaque(quantidadeS);
			break;
		case 2:
			System.out.println("Digite o valor do deposito a ser feito: ");
			quantidadeD = sc.nextInt();
			conta.contaDeposito(quantidadeD);
			break;
		}
		
		
		
		sc.close();
	}

}
