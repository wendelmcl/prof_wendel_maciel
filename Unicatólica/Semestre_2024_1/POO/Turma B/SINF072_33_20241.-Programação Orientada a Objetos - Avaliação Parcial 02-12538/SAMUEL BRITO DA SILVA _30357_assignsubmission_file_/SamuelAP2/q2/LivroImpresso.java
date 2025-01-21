package q2;

public class LivroImpresso implements Livro{

    @Override
    public void emprestarItem() {
        System.out.println("Item emprestado!");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emprestarItem'");
    }

    @Override
    public void devolverItem() {
        System.out.println("Item devolvido!");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolverItem'");
    }

    @Override
    public void consultarDisponibilidade() {
        System.out.println("Livros disponíveis");
        System.out.println("- A Bruxa de Blair");
        System.out.println("- Percy Jackson e o Mar de Monstros");
        System.out.println("- Como Eu Era Antes de Você");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarDisponibilidade'");
    }
    
    
}
