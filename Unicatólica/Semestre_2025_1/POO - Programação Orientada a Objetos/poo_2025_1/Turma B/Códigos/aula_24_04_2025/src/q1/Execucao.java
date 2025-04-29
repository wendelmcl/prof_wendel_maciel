package q1;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("", 0, "");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular: ");
		c1.setTitular(sc.nextLine());
		System.out.println("Digite o número da conta: ");
		c1.setNumeroConta(sc.nextInt());
		System.out.println("Digite a senha: ");
		c1.setSenha(sc.next());
		
		System.out.println("Digite o valor do depósito: ");
		c1.depositar(sc.nextDouble());
		System.out.println("Digite o valor do saque e a senha: ");
		c1.sacar(sc.nextDouble(), sc.next());
		System.out.println("\n");
		System.out.println("Digite a senha para exibir o saldo: ");
		c1.exibirSaldo(sc.next());
		System.out.println("Digite a senha atual e a nova senha: ");
		c1.alterarSenha(sc.next(), sc.next());
	}
}
