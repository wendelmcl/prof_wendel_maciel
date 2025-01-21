package questao2;

public class DVD1 implements DVD {

    @Override
    public void emprestaritem() {
        System.out.println("DVD emprestado dia 12/06/2024");
    }

    @Override
    public void devolveritem() {
        System.out.println("Deve devolver o DVD dia 21/06/2024");
    }

    @Override
    public void gravarDVD() {
        System.out.println("O DVD não poderá ser gravado!!!");
    }

}
