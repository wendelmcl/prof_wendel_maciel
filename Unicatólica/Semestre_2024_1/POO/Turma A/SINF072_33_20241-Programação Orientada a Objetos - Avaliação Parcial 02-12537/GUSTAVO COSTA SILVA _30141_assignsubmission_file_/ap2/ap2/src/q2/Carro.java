package q2;

public class Carro implements Veiculo{
    @Override
    public String acelerar() {
        return " Vrum Vrum";
    }

    @Override
    public String frear() {
        return " priiiii";
    }

    @Override
    public String fazerBbarulho() {
        return " Bi Bi";
    }
}
