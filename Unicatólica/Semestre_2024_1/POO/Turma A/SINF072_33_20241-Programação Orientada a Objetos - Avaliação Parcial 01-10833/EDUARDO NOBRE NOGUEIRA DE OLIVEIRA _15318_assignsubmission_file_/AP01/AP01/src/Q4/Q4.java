package Q4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c1 = new Conta();
		
		System.out.println("Digite o número da conta: ");
		c1.setCod(sc.nextInt());
		
		System.out.println("Digite o quanto deseja depositar: ");
		c1.depositar(sc.nextDouble());
		
		System.out.println("Saldo atual: " + c1.getSaldo());
		
		System.out.println("Digite o quanto deseja sacar: ");
		c1.sacar(sc.nextDouble());
		
		System.out.println("Saldo atual: " + c1.getSaldo());
	}

}
