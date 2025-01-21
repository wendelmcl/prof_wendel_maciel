package Q2;

public class Livroimpresso implements Itembiblioteca{
    private String titulo;
    private String autor;
    private int ano;

    @Override
    public void DevolverLivro() { 
        System.out.println("O Titulo do livro que voce pegou foi: "+getTitulo()); 
        System.out.println("O autor do livro que voce pegou foi: "+getAutor());
        System.out.println("O ano do livro que voce pegou foi: "+getAno());
        
    }

    @Override
    public void EmprestarLivro() {
        System.out.println("O Titulo do livro é "+getTitulo());
        System.out.println("Sthepng King "+getAutor());
        System.out.println("Ano de publicação "+getAno());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
