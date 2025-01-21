package segundachamadaquest2;

class LivroImpresso implements Livro {
    @Override
    public void emprestarItem() {
        System.out.println("Livro impresso emprestado");
    }
    @Override
    public void devolverItem() {
        System.out.println("Livro impresso devolvido");
    }
    @Override
    public void consultarDisponibilidade() {
        System.out.println("Livro impresso disponível para empréstimo");
    }
}
