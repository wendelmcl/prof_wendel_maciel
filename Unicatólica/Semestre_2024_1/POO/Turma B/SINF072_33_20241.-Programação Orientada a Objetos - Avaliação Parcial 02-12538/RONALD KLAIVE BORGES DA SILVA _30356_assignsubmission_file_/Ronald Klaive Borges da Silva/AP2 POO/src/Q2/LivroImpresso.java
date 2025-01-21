package Q2;

public class LivroImpresso implements Livro {
    private boolean disponivel;

    public LivroImpresso(boolean disponivel, String titulo) {
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
        System.out.println("Livro impresso devolvido com sucesso!");
        disponivel = true;
    }

    @Override
    public boolean consultarDisponibilidade() {
        return disponivel;
    }
}