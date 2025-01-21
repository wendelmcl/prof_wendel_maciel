package questao1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Exec {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		List<CartaoCredito> credito = new ArrayList<CartaoCredito>();
		
		CartaoCredito c1 = new CartaoCredito();
		c1.setNumeroCartao(87843784);
		c1.setCodigoseguranca(234);
		c1.setDataVencimento("09/30");
		credito.add(c1);
		c1
		List<CartaoDebito> debito = new ArrayList<CartaoDebito>();
		CartaoDebito d1 = new CartaoDebito();
		
		d1.setNumCartao(123567);
		d1.setCodseguranca(215);
		d1.setDateVencimento("24/29");
		debito.add(d1);
		
		List<Boleto> boletos = new ArrayList<Boleto>();
		Boleto b1 = new Boleto();
		
		b1.setCodigoBoleto(321871823);
		boletos.add(b1);
		
		List<Dinheiro> dinheiros = new ArrayList<Dinheiro>();
		Dinheiro n1 = new Dinheiro();
		n1.setNota("50");
		dinheiros.add(n1);
		
		
		
		System.out.println("Qual a forma de pagamento")
		System.out.println("Cartao de credito: " + c1.g)
		System.out.println
		
	}

}
