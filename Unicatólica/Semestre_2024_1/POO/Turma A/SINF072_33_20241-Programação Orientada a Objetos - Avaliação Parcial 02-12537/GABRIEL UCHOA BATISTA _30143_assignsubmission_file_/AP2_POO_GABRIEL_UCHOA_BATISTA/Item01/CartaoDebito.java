package Item01;

import java.util.Scanner;

public class CartaoDebito extends FormaPagamento{
    Scanner sc = new Scanner(System.in);
    private String titular;
    private int numeroCartao;
    private int CVV;
    private String dataVencimento;


    public CartaoDebito() {
        super("Cartão de Débito");
    }

    public void Cadastrar(){
        System.out.println("Insira as informações do Cartão de Crédito");
        System.out.println("Titular: ");
        this.titular = sc.nextLine();

        System.out.print("Número do Cartão: ");
        this.numeroCartao = sc.nextInt();

        System.out.print("Código de segurança: ");
        this.CVV = sc.nextInt();

        System.out.print("Data de Vencimento: ");
        this.dataVencimento = sc.next();

        System.out.print("Valor: ");
        this.setValor(sc.nextDouble());
    }

    public void Info(){
        System.out.println("--------------------------------------");
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Número do Cartão: " + this.numeroCartao);
        System.out.println("Código de segurança: " + this.CVV);
        System.out.println("Data de Vencimento: " + this.dataVencimento);
        System.out.println("Valor: " + this.getValor());
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
