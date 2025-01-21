package segundachamadaquest2;

class DVDclass implements DVD {
    @Override
    public void emprestarItem() {
        System.out.println("DVD emprestado");
    }

    @Override
    public void devolverItem() {
        System.out.println("DVD devolvido");
    }

    @Override
    public void gravarDVD() {
        System.out.println("DVD gravado");
    }
}

