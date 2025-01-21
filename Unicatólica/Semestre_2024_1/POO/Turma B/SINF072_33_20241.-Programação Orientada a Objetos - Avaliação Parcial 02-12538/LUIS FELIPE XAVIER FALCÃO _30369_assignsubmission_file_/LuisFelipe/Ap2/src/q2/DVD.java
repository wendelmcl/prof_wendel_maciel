package q2;

public class DVD implements DVDD {
    private String titulo;
    private boolean gravado;

    public DVD(String titulo) {
        this.titulo = titulo;
        this.gravado = false;
    }

    @Override
    public void empresterItem() {
        System.out.println("DVD " + titulo + " emprestado.");
    }

    @Override
    public void devolverItem() {
        System.out.println("DVD " + titulo + " devolvido.");
    }

    @Override
    public void gravarDVD() {
        if (!gravado) {
            System.out.println("DVD " + titulo + " gravado.");
            gravado = true;
        } else {
            System.out.println("DVD " + titulo + " já está gravado.");
        }
    }
}

