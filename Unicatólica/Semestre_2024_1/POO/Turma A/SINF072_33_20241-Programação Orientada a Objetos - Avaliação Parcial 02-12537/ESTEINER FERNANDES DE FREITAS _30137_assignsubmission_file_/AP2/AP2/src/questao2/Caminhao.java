package questao2;

class Caminhao implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Caminh�o acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Caminh�o freando...");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Barulho do caminh�o: Brrrrrum Brrrrrum!");
    }
}