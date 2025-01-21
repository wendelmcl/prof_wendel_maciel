package Questao02;

public class Motocicleta implements Veiculo {
    private String modelo;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Acelerar() {
        System.out.println("Motocicleta acelerando...");
    };

    public void Frear() {
        System.out.println("Motocicleta Freando...");
    };

    public void FazerBarulho() {
        System.out.println("Motocicleta buzina: Bip... Bip... ");
    };
}
