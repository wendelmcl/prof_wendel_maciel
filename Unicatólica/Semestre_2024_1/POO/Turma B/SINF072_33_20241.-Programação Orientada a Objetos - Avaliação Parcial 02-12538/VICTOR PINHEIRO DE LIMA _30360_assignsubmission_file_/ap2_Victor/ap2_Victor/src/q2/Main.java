package q2;

public class Main {
	 public static void main(String[] args) {
	     LivroImpresso livro = new LivroImpresso("A sútil arte de ligar o fod*-se");
	     DVD2 dvd = new DVD2("Interistelar");

	     System.out.println("Livro:");
	     livro.emprestarItem();
	     System.out.println("Disponibilidade: " + livro.consultarDisponibilidade());
	     livro.devolverItem();
	     System.out.println("Disponibilidade: " + livro.consultarDisponibilidade());

	     System.out.println("\nDVD:");
	     dvd.emprestarItem();
	     dvd.gravarDVD();
	     dvd.devolverItem();
	 }
	}