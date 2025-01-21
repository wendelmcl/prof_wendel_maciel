package Q2;

public class LivroImpressoClass implements LivroInterface {
    private boolean disponivel;

    public LivroImpressoClass(boolean disponivel) {
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