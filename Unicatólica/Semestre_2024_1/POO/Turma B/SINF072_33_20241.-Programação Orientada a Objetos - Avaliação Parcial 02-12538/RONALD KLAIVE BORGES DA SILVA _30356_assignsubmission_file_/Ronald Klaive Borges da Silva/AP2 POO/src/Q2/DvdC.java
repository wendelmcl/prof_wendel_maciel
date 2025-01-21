package Q2;

public class DvdC implements DVD {
    private boolean gravado;
    
    public boolean isGravado() {
        return gravado;
    }
    
    public void setGravado(boolean gravado) {
        this.gravado = gravado;
    }
    

    public DvdC(boolean gravado, String titulo) {
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
