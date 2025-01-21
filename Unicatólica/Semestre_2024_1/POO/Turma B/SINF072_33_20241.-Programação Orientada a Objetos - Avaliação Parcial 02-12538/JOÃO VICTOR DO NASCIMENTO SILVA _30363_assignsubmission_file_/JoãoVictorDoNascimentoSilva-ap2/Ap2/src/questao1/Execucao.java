package questao1;
public class Execucao {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira();
        geladeira.setMarca("Brastemp");
        geladeira.setModelo("BRT45");
        geladeira.setPreco(2300);
        geladeira.setPotencia("2500W");

        geladeira.imprimirInformacoes();
        geladeira.calcularGarantiaEstendida();
        System.out.println("----------------------------");
        TV tv = new TV();
        tv.setMarca("Samsung");
        tv.setModelo("QLED 4K");
        tv.setPreco(4500);
        tv.setPolegadas(55);

        tv.imprimirInformacoes();
        tv.calcularGarantiaEstendida();

        

    }
}
