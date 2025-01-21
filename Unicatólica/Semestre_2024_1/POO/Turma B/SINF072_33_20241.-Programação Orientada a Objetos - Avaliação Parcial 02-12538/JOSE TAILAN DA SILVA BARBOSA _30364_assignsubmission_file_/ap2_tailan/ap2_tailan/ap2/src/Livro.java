
public interface q2 {
void emprestar();
void devolver();
}

public interface Livro extends Item {
    void consultarDisponibilidade();
}


public interface DVD extends Item {
    void gravar();
}


public class LivroImpresso implements Livro {
    private String titulo;
    private boolean disponivel;

    public LivroImpresso(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            System.out.println("Livro " + titulo + " emprestado.");
            disponivel = false;
        } else {
            System.out.println("Livro " + titulo + " não está disponível.");
        }
    }

    @Override
    public void devolver() {
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


public class DVD implements DVD {
    private String titulo;

    public DVD(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void emprestar() {
        System.out.println("DVD " + titulo + " emprestado.");
    }

    @Override
    public void devolver() {
        System.out.println("DVD " + titulo + " devolvido.");
    }

    @Override
    public void gravar() {
        System.out.println("Gravando DVD " + titulo);
    }
}


public class Main {
    public static void main(String[] args) {
        LivroImpresso livro = new LivroImpresso("Java para iniciantes");
        livro.emprestar();
        livro.consultarDisponibilidade();
        livro.devolver();
        livro.consultarDisponibilidade();

        DVD dvd = new DVD("Matrix");
        dvd.emprestar();
        dvd.gravar();
        dvd.devolver();
    }
}