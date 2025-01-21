package q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		CartaoCredito cc1 = new CartaoCredito();
		cc1.setTipo("Credito");
		cc1.setValor(1200.00);
		cc1.setNum_cartao(123123132);
		cc1.setCvv(123);
		cc1.setData_venc("12/29");
		
		CartaoDebito cd1 = new CartaoDebito();
		cd1.setTipo("Debito");
		cd1.setValor(548.56);
		cd1.setNum_cartao(502452450);
		cd1.setCvv(326);
		cd1.setData_venc("11/30");
		
		Dinheiro d1 = new Dinheiro();
		d1.setTipo("Dinheiro");
		d1.setValor(55.30);
		d1.setTotal(100.00);
				
		Boleto b1 = new Boleto();
		b1.setTipo("Boleto");
		b1.setValor(369.34);
		b1.setNome_cliente("Eduardo Nobre");
		b1.setCod_boleto(1243424);
		b1.setCpf_cliente("123.456.789-12");
		
		ArrayList<FormaPagamento> pagamento = new ArrayList<FormaPagamento>();
		pagamento.add(cc1);
		pagamento.add(cd1);
		pagamento.add(d1);
		pagamento.add(b1);
		
		for(int i = 0; i < pagamento.size(); i++){
			pagamento.get(i).imprime();
		}
		
	}

}
