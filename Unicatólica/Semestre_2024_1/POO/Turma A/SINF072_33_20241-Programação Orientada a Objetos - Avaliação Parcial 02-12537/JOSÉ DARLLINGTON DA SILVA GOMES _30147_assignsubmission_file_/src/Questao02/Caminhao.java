package Questao02;

public class Caminhao implements Veiculo {
    private String modelo;

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Acelerar() {
        System.out.println("Caminhao acelerando...");
    };

    public void Frear() {
        System.out.println("Caminhao Freando...");
    };

    public void FazerBarulho() {
        System.out.println("Caminhao Buzina: Bip... Bip... ");
    };
}
