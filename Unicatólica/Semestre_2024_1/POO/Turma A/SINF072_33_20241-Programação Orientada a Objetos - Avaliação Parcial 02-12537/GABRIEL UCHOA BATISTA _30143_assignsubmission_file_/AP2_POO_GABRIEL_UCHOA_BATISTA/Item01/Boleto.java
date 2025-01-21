package Item01;

import java.util.Scanner;

public class Boleto extends FormaPagamento{
    Scanner sc = new Scanner(System.in);
    private int codigoBarras;
    private String dataVencimento;

    public Boleto() {
        super("Boleto");
    }

    public void Cadastrar(){
        System.out.println("Insira as informações do Boleto");
        System.out.print("Código de barras: ");
        this.codigoBarras = sc.nextInt();

        System.out.print("Data de Vencimento: ");
        this.dataVencimento = sc.next();

        System.out.print("Valor: ");
        this.setValor(sc.nextDouble());
    }

    public void Info(){
        System.out.println("--------------------------------------");
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cod. de Barras: " + this.codigoBarras);
        System.out.println("Vencimento: " + this.dataVencimento);
        System.out.println("Valor: " + this.getValor());
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
