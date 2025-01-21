package q1;
import java.util.Scanner;
import java.util.ArrayList;

public class Exe {

	public static void main(String[] args) {
		String num;
		String nome;
		Scanner sc = new Scanner(System.in);
		ArrayList<String> Pagamento = new ArrayList<>(0);
		Pagamento.add("Cartão de Crédito");
		Pagamento.add("Cartão de Débito");
		Pagamento.add("Boleto");
		Pagamento.add("Dinheiro");
		
		System.out.println("Qual é o seu nome? ");
		nome = sc.next();
		System.out.println("Qual será a forma de pagamento? 0 = Credito, 1 = Debito, 2 = Boleto, 3 = Dinheiro");
		num = sc.next();

		if (num == Pagamento.get(0)){
			System.out.println("Qual o número do cartão?");
			String numCartao = sc.next();
			System.out.println("Qual o número de segurança do cartão?");
			String numSegurança = sc.next();
			System.out.println("Qual é a data de vencimento?");
			String vencimento = sc.next();
			
			System.out.println("CONTA PAGA: ");
			System.out.println("######################");
			System.out.println("NOME: " + nome);
			System.out.println("NUMERO DO CARTAO" + numCartao);
			System.out.println("NUMERO DE SEGURANÇA" + numSegurança);
			System.out.println("DATA DE VENCIMENTO DO CARTAO: " + vencimento);
			
			
			
			
			
		}
		 
		
		
		sc.close();
	}
	
}
