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
            System.out.println("DVD n�o est� dispon�vel para empr�stimo.");
        }
    }

    @Override
    public void devolverItem() {
        if (!disponivel) {
            System.out.println("DVD devolvido com sucesso!");
            disponivel = true;
        } else {
            System.out.println("DVD j� est� dispon�vel.");
        }
    }

    @Override
    public void gravarDVD() {
        System.out.println("Gravando DVD...");
    }
}
