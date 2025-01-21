package q2;

public class Biblioteca {
	
	public interface ItemBiblioteca {
	    void emprestarItem();
	    void devolverItem();
	}

	public interface Livro extends ItemBiblioteca {
	    void consultarDisponibilidade();
	    void adicionarExemplar();
	}

	public interface DVD extends ItemBiblioteca {
	    void gravarDVD();
	    void adicionarCopia();
			
	}
}
