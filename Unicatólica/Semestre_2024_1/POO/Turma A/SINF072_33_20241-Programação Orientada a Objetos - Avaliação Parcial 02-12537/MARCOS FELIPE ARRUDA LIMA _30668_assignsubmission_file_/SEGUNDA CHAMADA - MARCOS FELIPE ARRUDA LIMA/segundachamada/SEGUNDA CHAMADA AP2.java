package segundachamadaquest2;

public class Execucao {

	public static void main(String[] args) {
		 Livro livro = new LivroImpresso();
	        livro.consultarDisponibilidade();
	        livro.emprestarItem();
	        livro.devolverItem();

	        DVD dvd = new DVDclass();
	        dvd.emprestarItem();
	        dvd.gravarDVD();
	        dvd.devolverItem();
	    }
	}