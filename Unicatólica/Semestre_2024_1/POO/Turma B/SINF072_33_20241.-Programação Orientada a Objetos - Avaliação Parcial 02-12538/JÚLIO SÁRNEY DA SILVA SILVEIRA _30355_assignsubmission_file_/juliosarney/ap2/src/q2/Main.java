package q2;



public class Main extends Itembiblioteca{

	public static void main(String[] args) {
	
	
		        
		        LivroImpresso livro = new LivroImpresso("O Senhor dos An�is");
		        livro.emprestarItem();
		        
		        livro.emprestarItem();

		        livro.consultarDisponibilidade();

		        livro.devolverItem();

		        livro.devolverItem();

		        livro.adicionarExemplar();

		        dvd dvd = new DVD("Interestelar");
		        dvd.gravardvd();
		        
		        dvd.emprestarItem();

		        dvd.devolverItem();
		    }
		

	}


