package q2;

public class LivroImpresso implements Livro {
    private String titulo;
    private boolean disponivel;

    public LivroImpresso(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    @Override
    public void empresterItem() {
        if (disponivel) {
            System.out.println("Livro " + titulo + " emprestado.");
            disponivel = false;
        } else {
            System.out.println("Livro " + titulo + " não está disponível.");
        }
    }

    @Override
    public void devolverItem() {
        if (!disponivel) {
            System.out.println("Livro " + titulo + " devolvido.");
            disponivel = true;
        } else {
            System.out.println("Livro " + titulo + " já está disponível.");
        }
    }

    @Override
    public void consultarDisponibilidade() {
        System.out.println("Livro " + titulo + " está " + (disponivel ? "disponível" : "indisponível"));
    }
}