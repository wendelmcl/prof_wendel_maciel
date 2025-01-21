package Questao4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// questão não resolvida por completo

		Scanner entrada = new Scanner(System.in);

		Usuario p1 = new Usuario(20, 100.0, 200, 50);

		System.out
				.print("Olá, informe o digito da ação que você deseja realizar\n"
						+ "(1 - Consultar saldo\n"
						+ "2 - Realizar saque\n"
						+ "3 - Realizar deposito\n" + "4 - Sair)\n");

		int acao = entrada.nextInt();

		if (acao == 1) {
			System.out.println(p1.consultarSaldo());
		}

		if (acao == 2) {
			System.out.println("Digite o valor que você deseja sacar: ");
			p1.saque = entrada.nextDouble();
			if (p1.saque > p1.saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				p1.sacar();
				System.out.println("Você sacou " + p1.saque);
				
			}
		}

		if (acao == 3) {
			System.out.println("Digite o valor que você deseja depositar: ");
			p1.deposito = entrada.nextDouble();
			
			System.out.println("Seu saldo agora é de: " + p1.consultarSaldo());
		}
		
		if (acao == 4){
			System.out.println("Você saiu do sistema!");
		}

		entrada.close();
	}

}
