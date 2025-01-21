package questao2;

class Caminhao implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Caminhão acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Caminhão freando...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Barulho do caminhão: Brrrrrum Brrrrrum!");
    }
}