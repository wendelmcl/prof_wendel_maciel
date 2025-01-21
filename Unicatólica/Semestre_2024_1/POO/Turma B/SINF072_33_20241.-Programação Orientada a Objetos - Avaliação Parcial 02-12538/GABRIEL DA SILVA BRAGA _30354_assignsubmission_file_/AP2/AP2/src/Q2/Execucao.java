package Q2;

public class Execucao {
    public static void main(String[] args) {
        Livroimpresso l1 = new Livroimpresso();
        l1.setTitulo("O Senhor dos Anéis");
        l1.setAutor("J.R.R. Tolkien");
        l1.setAno(2023);
        l1.DevolverLivro();
        
        Livroimpresso l2 = new Livroimpresso();
        l2.setTitulo("O Hobbit");
        l2.setAutor("J.R.R. Tolkien");
        l2.setAno(2024);
        l1.EmprestarLivro();

        Itemdvd d1 = new Itemdvd();
        d1.setTitulo("O Senhor dos Anéis - O Filme");
        d1.setAno(2001);
        d1.setGenero("Fantasia");
        d1.consultarDispositivo();

        Itemdvd d2 = new Itemdvd();
        d2.setTitulo("O Hobbit - O Filme");
        d2.setAno(2012);
        d2.setGenero("Fantasia");
        d2.gravarDvd();
        

    }
}
