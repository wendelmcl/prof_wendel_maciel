package q2;

public class Motocileta implements Veiculo {
    String marca = "Biz";
    @Override
    public String acelerar() {
        return " vra vra";
    }

    @Override
    public String frear() {
        return " briiii";
    }

    @Override
    public String fazerBbarulho() {
        return " fom fom";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = "Biz";
    }
}
