package questao2;
public class DVD2 implements DVD{
    private int quantidade;

    @Override
    public void gravarDVD() {
        System.out.println("Hoje ja foi impresso "+quantidade+" Dvd(s)");
    }

    @Override
    public void emprestarItem() {
        this.quantidade = -1;
        System.out.println("O DVD foi emprestado");
    }

    @Override
    public void devolverItem() {
        this.quantidade = 1;
        System.out.println("O DVD foi devolvido");
    }

}
