package q1;
import java.util.ArrayList;
public class Banco {
	
	
	private ArrayList<FormaPagamento> pagamento;
	

	public Banco() {
	    this.pagamento = new ArrayList<>();
	}


	public void adicionarPagamento(FormaPagamento forma) {
	    pagamento.add(forma);
	    System.out.println("Pagamento adicionado: \n" + forma);
	}





	 public void exibirPagamento() {
	        if (pagamento.isEmpty()) {
	            System.out.println("Nenhum pagamento");
	        } else {
	            System.out.println("Lista de pagamentos:");
	            for (FormaPagamento forma : pagamento) {
	                System.out.println(forma);
	            }
	        }
	    }}

	

















































































