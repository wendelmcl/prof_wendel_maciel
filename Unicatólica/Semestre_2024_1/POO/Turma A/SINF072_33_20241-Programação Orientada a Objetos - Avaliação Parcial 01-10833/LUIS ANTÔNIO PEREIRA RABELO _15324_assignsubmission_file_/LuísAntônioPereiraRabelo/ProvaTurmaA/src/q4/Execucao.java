package q4;
import java.util.Scanner;
public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta cont = new Conta();
		System.out.println("Bem vindo ao banco. Digite o numero da sua conta: ");
		int id = cont.setId(sc.nextInt());
		System.out.println("Conta de n°" + cont.getId() +" Digite 1 - Deposito, 2 - saque, 3 - consulta, 4 - fim: ");
		int opcao = sc.nextInt();
		while(opcao  != 4){
			if(opcao == 1){
			System.out.println("Digite o valor do deposito: ");
			double deposito = sc.nextDouble();
			cont.Depositar(deposito);
		}else if(opcao == 2){
			System.out.println("Digite o valor do saque: ");
			double saque = sc.nextDouble();
			cont.Sacar(saque);
		}else if(opcao == 3){
			cont.Consulta();;
		}else{
			System.out.println("Codigo invalido");
		}
		System.out.println("Conta de n°" + cont.getId() +" Digite 1 - Deposito, 2 - saque, 3 - consulta, 4 - fim: ");
		
	}
}
}


