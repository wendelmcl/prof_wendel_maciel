package questao2;

public class LivroImpresso implements Livro {

    @Override
    public void ConsultarDisponibilidade() {
        System.out.println("há disponibilidade do livro!");
    }

    @Override
    public void emprestaritem() {
        System.out.println("Livro emprestado dia: 12/06/2024");
    }

    @Override
    public void devolveritem() {
        System.out.println("Deve devolver o livro dia 21/06/2024");
    }

}
