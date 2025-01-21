package q2;

public class LivroImpresso implements Livro {
    private boolean disponivel;

    public LivroImpresso(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void emprestarItem() {
        if (disponivel) {
            System.out.println("Livro impresso emprestado com sucesso!");
            disponivel = false;
        } else {
            System.out.println("Livro impresso não está disponível para empréstimo.");
        }
    }

    @Override
    public void devolverItem() {
        if (!disponivel) {
            System.out.println("Livro impresso devolvido com sucesso!");
            disponivel = true;
        } else {
            System.out.println("Livro impresso já está disponível.");
        }
    }

    @Override
    public boolean consultarDisponibilidade() {
        return disponivel;
    }
}
