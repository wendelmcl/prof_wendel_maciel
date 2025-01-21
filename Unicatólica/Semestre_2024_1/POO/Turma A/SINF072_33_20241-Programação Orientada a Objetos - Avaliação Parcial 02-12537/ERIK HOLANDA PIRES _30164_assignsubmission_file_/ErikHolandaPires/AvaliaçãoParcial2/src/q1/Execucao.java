package q1;
import java.util.ArrayList;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       Scanner scanner = new Scanner(System.in);
	        System.out.println("Deseja processar o pagamento? (S/N)");
	        String resposta = scanner.nextLine();

	        if (resposta.equalsIgnoreCase("S")) {
	            cartao.processarPagamento();
	            System.out.println(cartao.gerarRecibo());
	        } else {
	            System.out.println("Pagamento cancelado.");
	        }
	    }
	}
		
	}

