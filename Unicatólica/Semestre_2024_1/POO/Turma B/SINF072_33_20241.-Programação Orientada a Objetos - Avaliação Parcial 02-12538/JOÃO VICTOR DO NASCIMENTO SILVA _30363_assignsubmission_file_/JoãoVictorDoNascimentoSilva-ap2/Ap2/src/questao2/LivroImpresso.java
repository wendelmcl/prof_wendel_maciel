package questao2;
public class LivroImpresso implements Livro{

    private int disponibilidade;


    @Override
    public void consultarDisponibilidade() {

        this.disponibilidade = 1;
        System.out.println("Existem atualmente "+disponibilidade+" Livro disponivel.");
    }

    @Override
    public void emprestarItem() {
        this.disponibilidade = -1;
        System.out.println("O livro foi imprestado");
    }

    @Override
    public void devolverItem() {
        this.disponibilidade = 1;
        System.out.println("O livro foi devolvido");
    }

}
