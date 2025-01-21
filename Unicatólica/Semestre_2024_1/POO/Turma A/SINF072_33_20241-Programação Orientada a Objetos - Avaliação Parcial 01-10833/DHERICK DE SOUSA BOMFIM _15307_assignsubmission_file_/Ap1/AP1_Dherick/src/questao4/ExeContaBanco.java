package questao4;

import java.util.Scanner;

public class ExeContaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta = new ContaBancaria();
		
		System.out.print("Digite seu ID : ");
		conta.setId(sc.nextInt());
		
		System.out.print("Digite seu Saldo : ");
		conta.setSaldo(sc.nextFloat());
		
		System.out.println("ID : "+ conta.getId() + "\nSaldo : " + conta.getSaldo());
		
		System.out.println("Qual operação deseja realizar? [1 - Sacar | 2 - Depositar | 3 - Consultar]");
		int operacao = sc.nextInt();
		switch (operacao){
		case 1 :
			System.out.println("Saldo atual : " + conta.getSaldo()+ "\nQuanto deseja sacar?");
			float saque = sc.nextFloat();
			ContaBancaria.sacar(conta.getSaldo(), saque);
			System.out.println("Saldo : " + conta.getSaldo());
		case 2 :
			System.out.println("Saldo atual : " + conta.getSaldo()+ "\nQuanto deseja depositar?");
			float dep = sc.nextFloat();
			ContaBancaria.deposito(conta.getSaldo(), dep);
			System.out.println("Saldo : " + conta.getSaldo());
		case 3 : 
			System.out.println("Saldo : " + ContaBancaria.consulta(conta.getSaldo()));
		}
		
		sc.close();
	}

}
