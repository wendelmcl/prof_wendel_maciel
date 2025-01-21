package q2;

public class Execucao {
    public static void main(String[] args) {
        LivroImpresso livro = new LivroImpresso("Java para iniciantes");
        DVD dvd = new DVD("Filme de ação");

        livro.empresterItem();
        livro.consultarDisponibilidade();

        dvd.empresterItem();
        dvd.gravarDVD();

        livro.devolverItem();
        livro.consultarDisponibilidade();

        dvd.devolverItem();
    }
}