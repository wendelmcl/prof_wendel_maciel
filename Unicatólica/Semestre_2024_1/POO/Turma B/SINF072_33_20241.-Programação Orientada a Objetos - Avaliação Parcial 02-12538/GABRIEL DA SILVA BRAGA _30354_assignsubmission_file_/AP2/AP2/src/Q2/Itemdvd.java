package Q2;

public class Itemdvd implements Itemlocadora {

    private String titulo;
    private String genero;
    private int ano;
    @Override
    public void EmprestarLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EmprestarLivro'");
    }

    @Override
    public void DevolverLivro() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'DevolverLivro'");
    }
    

    @Override
    public void consultarDispositivo() {
        System.out.println("o titulo do dispositivo é "+getTitulo());
        System.out.println("o genero do dispositivo é "+getGenero());
        System.out.println("o ano do dispositivo é "+getAno());
        
    }

    @Override
    public void gravarDvd() {
        System.out.println("gravando dvd...");
        System.out.println("o titulo é "+getTitulo());
        System.out.println("o genero é "+getGenero());
        System.out.println("o ano é "+getAno());
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

