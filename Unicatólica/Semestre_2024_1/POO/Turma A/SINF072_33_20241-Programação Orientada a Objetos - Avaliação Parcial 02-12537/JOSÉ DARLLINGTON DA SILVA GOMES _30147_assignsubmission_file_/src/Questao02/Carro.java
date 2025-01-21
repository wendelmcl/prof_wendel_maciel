package Questao02;

public class Carro implements Veiculo {
    private String modelo;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Acelerar() {
        System.out.println("Carro Acelerando...");
    };

    public void Frear() {
        System.out.println("Carro Freando...");
    };

    public void FazerBarulho() {
        System.out.println("Carro buzina: Bip... Bip... ");
    };
}
