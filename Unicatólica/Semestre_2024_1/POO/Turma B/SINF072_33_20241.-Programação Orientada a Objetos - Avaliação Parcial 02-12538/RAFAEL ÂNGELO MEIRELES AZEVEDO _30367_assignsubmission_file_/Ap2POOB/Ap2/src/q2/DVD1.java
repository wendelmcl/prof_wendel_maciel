package q2;

public class DVD1 implements DVD {
    private boolean disponivel;

    public DVD1(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public void emprestarItem() {
        if (disponivel) {
            System.out.println("DVD emprestado com sucesso!");
            disponivel = false;
        } else {
            System.out.println("DVD não está disponível para empréstimo.");
        }
    }

    @Override
    public void devolverItem() {
        if (!disponivel) {
            System.out.println("DVD devolvido com sucesso!");
            disponivel = true;
        } else {
            System.out.println("DVD já está disponível.");
        }
    }

    @Override
    public void gravarDVD() {
        System.out.println("Gravando DVD...");
    }
}
