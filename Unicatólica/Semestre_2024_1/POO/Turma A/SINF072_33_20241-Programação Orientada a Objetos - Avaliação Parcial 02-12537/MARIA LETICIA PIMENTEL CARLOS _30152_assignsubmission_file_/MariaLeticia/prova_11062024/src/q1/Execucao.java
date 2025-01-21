package q1;

public class Execucao {

	public static void main(String[] args) {
		Banco banco = new Banco();

	       
        banco.adicionarPagamento(new CartaodeCredito("Cartao de Credito",1200,"212121212" ));
        banco.adicionarPagamento(new Dinheiro("Dinheiro",3400,121211212));

        
        banco.listarPagamento();

      
        banco.exibirPagamento();

	}

}
