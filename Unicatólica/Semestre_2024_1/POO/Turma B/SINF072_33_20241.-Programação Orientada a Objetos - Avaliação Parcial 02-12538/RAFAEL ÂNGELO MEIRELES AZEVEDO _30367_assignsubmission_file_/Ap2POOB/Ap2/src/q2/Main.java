package q2;

public class Main {
    public static void main(String[] args) {
        LivroImpresso livro = new LivroImpresso(true);
        DVD dvd = new DVD1(true);

        System.out.println("Livro Impresso:");
        livro.emprestarItem();
        System.out.println("Disponibilidade: " + livro.consultarDisponibilidade());
        livro.devolverItem();
        System.out.println("Disponibilidade: " + livro.consultarDisponibilidade());
        System.out.println();

        System.out.println("DVD:");
        dvd.emprestarItem();
        dvd.gravarDVD();
        dvd.devolverItem();
    }
}