package Questão04;

import java.util.Scanner;

public class Execução {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Resp, conti;
		Scanner sc = new Scanner(System.in);
		Conta co = new Conta();
		
		System.out.println("Qual o seu id: ");
		co.setId(sc.nextInt());
		
		System.out.println("Qual o seu saldo: ");
		co.setSaldo(sc.nextFloat());
		
		System.out.println("Deseja começãr uma operação: ");
		conti = sc.next();
		while(conti.equals("S")) {
			System.out.println("Você deseja depositar(D), sacar(S) ou verificar seu saldo(V): ");
			Resp = sc.next();
			if (Resp.equals("D")) {
				System.out.println("Quanto você deseja depositar: ");
				co.depositar(sc.nextDouble());
				System.out.println("Seu novo saldo é: " + co.getSaldo());
			}else if(Resp.equals("S")) {
				System.out.println("Quanto você desejar sacar: ");
				co.sacar(sc.nextFloat());
				System.out.println("Seu novo saldo sera: " + co.getSaldo());
			}else if(Resp.equals("V")) {
				System.out.println("Seu saldo é: " + co.getSaldo());
			}else {
				System.out.println("Erro repita o processo de escolha: ");
				Resp = sc.next();
			}
			System.out.println("Deseja iniciar outra operação: ");
			conti = sc.next();
		}
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("OPERAÇÃO ENCERRADA");
		System.out.println("Obrigado por utilizar nosso sistema!!!");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	}

}
