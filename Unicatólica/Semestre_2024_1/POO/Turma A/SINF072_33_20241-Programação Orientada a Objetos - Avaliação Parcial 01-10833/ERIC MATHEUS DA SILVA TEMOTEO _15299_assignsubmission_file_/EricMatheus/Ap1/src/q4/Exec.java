package q4;
import java.util.Scanner;
public class Exec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		conta c1 = new conta();
		System.out.println("Crie uma conta: ");
		System.out.println("Digite o número da conta: ");
		c1.setNumConta(sc.nextInt()); 
		System.out.println("Digite o saldo da conta: ");
		c1.setSaldo(sc.nextDouble());
		
		
		System.out.println("#####################################");
		System.out.println("");
		System.out.println("Numero da conta: " + c1.getNumConta());
		System.out.println("Saldo da conta: " + c1.getSaldo());
		
		System.out.println("O que deseja fazer? (1 = DEPOSITO / 2 = SACAR / 3 = CONSULTAR SALDO / 4 = SAIR)");
		int resp = sc.nextInt();
		double nSaldo=0;
		while (resp != 4){
			
			if (resp == 1){
				System.out.println("Quanto quer depositar? ");
				double deposito = sc.nextDouble();
				nSaldo = deposito + c1.getSaldo();
			} else if (resp == 2){
				System.out.println("Quanto quer sacar? ");
				double sacar = sc.nextDouble();
				nSaldo = nSaldo - sacar;
			} else if (resp == 3){
				System.out.println("Seu saldo é de: R$" + nSaldo);
			}
			System.out.println("O que deseja fazer? (1 = DEPOSITO / 2 = SACAR / 3 = CONSULTAR SALDO / 4 = SAIR)");
			resp = sc.nextInt();
		}
		
		
		
		
		sc.close();
	}
	
}
