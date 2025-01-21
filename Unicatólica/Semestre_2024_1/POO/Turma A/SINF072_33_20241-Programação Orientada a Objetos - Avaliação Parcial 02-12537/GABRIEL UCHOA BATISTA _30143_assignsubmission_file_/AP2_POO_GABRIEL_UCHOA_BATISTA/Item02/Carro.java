package Item02;

public class Carro implements Veiculo{
    private int numero;

    public Carro(int numero){
        this.numero = numero;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro Número " + this.numero + " Acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Carro Número " + this.numero + " Freando...");

    }

    @Override
    public void fazerBarulho() {
        System.out.println("Carro Número " + this.numero + " Buzinando...");
    }
}
