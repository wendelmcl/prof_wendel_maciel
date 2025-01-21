package questao2;

public class Execucao {
    public static void main(String[] args) {
        LivroImpresso l1 = new LivroImpresso();
        DVD1 d1 = new DVD1();

        System.out.println("LIVRO: ");

        l1.ConsultarDisponibilidade();
        l1.emprestaritem();
        l1.devolveritem();

        System.out.println("DVD: ");

        d1.emprestaritem();
        d1.devolveritem();
        d1.gravarDVD();

    }

}
