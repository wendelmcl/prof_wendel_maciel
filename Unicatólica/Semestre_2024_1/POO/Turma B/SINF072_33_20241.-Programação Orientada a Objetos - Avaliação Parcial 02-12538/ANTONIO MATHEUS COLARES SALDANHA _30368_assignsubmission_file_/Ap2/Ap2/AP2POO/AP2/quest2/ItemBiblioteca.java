public class ItemBiblioteca {
    // Interface ItemBiblioteca
public interface ItemBiblioteca {
    void emprestarItem();
    void devolverItem();
}

// Interface Livro
public interface Livro extends ItemBiblioteca {
    boolean consultarDisponibilidade();
}

// Interface DVD
public interface DVD extends ItemBiblioteca {
    void gravarDVD();
}

// Classe Concreta LivroImpresso
public class LivroImpresso implements Livro {
    private String titulo;
    private boolean disponivel;

    public LivroImpresso(String titulo) {
        this.titulo = titulo;
        this.disponivel = true;
    }

    @Override
    public void emprestarItem() {
        disponivel = false;
    }

    @Override
    public void devolverItem() {
        disponivel = true;
    }

    @Override
    public boolean consultarDisponibilidade() {
        return disponivel;
    }
}

// Classe Concreta DVD
public class DVD implements DVD {
    private String titulo;

    public DVD(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void emprestarItem() {
        // implementação específica para DVD
    }

    @Override
    public void devolverItem() {
        // implementação específica para DVD
    }

    @Override
    public void gravarDVD() {
        // implementação específica para DVD
    }
}
}
