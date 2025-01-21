package q1;

import java.util.ArrayList;
import java.util.Scanner;

public class Escolha {
	ArrayList<FormaPagamento> pag = new ArrayList<FormaPagamento>();
	
	public void adicionapagamento(FormaPagamento pagamento){
		for(int i = 0; i < pag.size(); i++){ 
			pag.add(pagamento);
			System.out.println("pagamento feito com sucesso");
		}
	}
	}