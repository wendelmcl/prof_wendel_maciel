package questao02;

public class BibliotecaDemo { 
	public static void main(String[] args) {
		LivroImpresso livro = new LivroImpresso();
		DVDImp1 dvd = nwe DVDImp();
		
		System.out.println("Disponibilidade do Livro: " + livro.consultarrDisponibiliade());
		livro.emprestarItem();
		System.out.println("Disponibilidade do livro �pos empr�stimo:" + livro.consultarDisponibilidade());
		livro.devolverItem();
		System.out.println("Disponibilidade do livro �pos devolu��o:" + livro.consultarDisponibilidade();)
		
		dvd.gravarDVD();
		dvd.emprestarItem();
		dvd.devolver.Item();
	}
}

