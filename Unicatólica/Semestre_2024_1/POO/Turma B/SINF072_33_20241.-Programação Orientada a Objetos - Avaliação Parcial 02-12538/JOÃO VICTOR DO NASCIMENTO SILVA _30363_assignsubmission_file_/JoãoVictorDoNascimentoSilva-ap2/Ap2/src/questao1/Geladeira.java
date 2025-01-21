package questao1;
public class Geladeira extends Eletrodomestico {
    private String potencia;
    
    @Override
    public void calcularGarantiaEstendida() {
        System.out.println("Garantia extendida de 3 dias ativa");
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("A marca do produto é "+getMarca());
        System.out.println("O modelo do produto é "+getModelo());
        System.out.println("O preço do produto é "+getPreco());
        System.out.println("A potencia da geladeira é de "+potencia);
    }

}
