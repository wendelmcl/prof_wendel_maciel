package Item02;

public class Caminhao implements Veiculo{
    private int numero;

    public Caminhao(int numero){
        this.numero = numero;
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhao Número " + this.numero + " Acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Caminhao Número " + this.numero + " Freando...");

    }

    @Override
    public void fazerBarulho() {
        System.out.println("Caminhao Número " + this.numero + " Buzinando...");
    }
}
