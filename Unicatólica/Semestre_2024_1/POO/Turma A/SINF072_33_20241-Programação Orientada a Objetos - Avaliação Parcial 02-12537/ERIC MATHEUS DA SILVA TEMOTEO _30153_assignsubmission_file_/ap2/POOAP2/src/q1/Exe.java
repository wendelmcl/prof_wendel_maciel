package q1;
import java.util.Scanner;
import java.util.ArrayList;

public class Exe {

	public static void main(String[] args) {
		String num;
		String nome;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> Pagamento = new ArrayList<>(0);
		Pagamento.add("Cart�o de Cr�dito");
		Pagamento.add("Cart�o de D�bito");
		Pagamento.add("Boleto");
		Pagamento.add("Dinheiro");
		
		System.out.println("Qual � o seu nome? ");
		nome = sc.next();
		System.out.println("Qual ser� a forma de pagamento? 0 = Credito, 1 = Debito, 2 = Boleto, 3 = Dinheiro");
		num = sc.next();

		if (num == Pagamento.get(0)){
			System.out.println("Qual o n�mero do cart�o?");
			String numCartao = sc.next();
			System.out.println("Qual o n�mero de seguran�a do cart�o?");
			String numSeguran�a = sc.next();
			System.out.println("Qual � a data de vencimento?");
			String vencimento = sc.next();
			
			System.out.println("CONTA PAGA: ");
			System.out.println("######################");
			System.out.println("NOME: " + nome);
			System.out.println("NUMERO DO CARTAO" + numCartao);
			System.out.println("NUMERO DE SEGURAN�A" + numSeguran�a);
			System.out.println("DATA DE VENCIMENTO DO CARTAO: " + vencimento);
			
			
			
			
			
		}
		 
		
		
		sc.close();
	}
	
}
