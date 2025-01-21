package Item02;

public class Motocicleta implements Veiculo{
    private int numero;

    public Motocicleta(int numero){
        this.numero = numero;
    }

    @Override
    public void acelerar() {
        System.out.println("Motocicleta Número " + this.numero + " Acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Motocicleta Número " + this.numero + " Freando...");

    }

    @Override
    public void fazerBarulho() {
        System.out.println("Motocicleta Número " + this.numero + " Buzinando...");
    }
}
