package Q2;

public class DVDClass implements DVDInterface {
    private boolean gravado;

    public DVDClass(boolean gravado) {
        this.gravado = gravado;
    }

    @Override
    public void emprestarItem() {
        System.out.println("DVD emprestado com sucesso!");
    }

    @Override
    public void devolverItem() {
        System.out.println("DVD devolvido com sucesso!");
    }

    @Override
    public void gravarDVD() {
        if (!gravado) {
            System.out.println("DVD gravado com sucesso!");
            gravado = true;
        } else {
            System.out.println("DVD já está gravado.");
        }
    }
}