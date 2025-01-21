package questao02;

public class ItemBiblioteca {
	inteface ItemBiblioteca {
		void emprestarItem();
		void devolverItem();
	}
	
	interface Livro extends ItemBiblioteca {
		boolean consultarDisponibiliadade();
	}
	
	interface DVD extends ItemBiblioteca {
		void gravarDVD();
	}
	
	

}
