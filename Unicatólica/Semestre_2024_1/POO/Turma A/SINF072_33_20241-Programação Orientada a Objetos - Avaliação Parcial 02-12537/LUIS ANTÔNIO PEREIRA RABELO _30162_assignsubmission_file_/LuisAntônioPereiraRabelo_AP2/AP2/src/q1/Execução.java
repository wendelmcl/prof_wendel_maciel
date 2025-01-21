package q1;

import java.util.Scanner;

public class Execução {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CartaoCredito cc1 = new CartaoCredito();
		CartaoDebito cd1 = new CartaoDebito();
		Boleto b1 = new Boleto();
		Dinheiro d1 = new Dinheiro();
		Escolha e1 = new Escolha();
		System.out.println("Quantos pagamento voce vai fazer?");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++){
		System.out.println("Digite uma opção 1 - cartao credito, 2 - cartao debito, 3 - boleto, 4 - dinheiro:");
		int a1 = sc.nextInt();
		if(a1 == 1){
			cc1.setNumcred(5214);
			cc1.setCVCcred(242);
			cc1.setDatavenccred("12/25");
			cc1.setValor(19.50);
			e1.adicionapagamento(cc1);
			System.out.println("Pagamento feito");
			System.out.println("Recibo gerado");
		}else if(a1 == 2){
			cd1.setNumdeb(5224);
			cd1.setCVCdeb(499);
			cd1.setDatavencdeb("13/35");
			e1.adicionapagamento(cd1);
			System.out.println("Pagamento feito");
			System.out.println("Recibo gerado");
		}else if(a1 == 3){
			b1.setNumbol("1");
			b1.setValor(500);
			e1.adicionapagamento(b1);
			System.out.println("Pagamento feito");
			System.out.println("Recibo gerado");
		}else if(a1 == 4){
			d1.setValor(5067);
			e1.adicionapagamento(d1);
			System.out.println("Pagamento feito");
			System.out.println("Recibo gerado");
		}else{
			System.out.println("Valor invalido");
		}
	}
}

}