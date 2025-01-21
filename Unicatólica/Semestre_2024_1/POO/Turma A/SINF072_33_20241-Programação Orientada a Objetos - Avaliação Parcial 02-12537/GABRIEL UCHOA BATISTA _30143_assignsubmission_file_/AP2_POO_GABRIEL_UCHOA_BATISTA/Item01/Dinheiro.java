package Item01;

import java.util.Scanner;

public class Dinheiro extends FormaPagamento{
    Scanner sc = new Scanner(System.in);
    private Double valor;

    public Dinheiro() {
        super("Dinheiro");
    }

    public void Cadastrar(){
        System.out.println("Insira as informações de Dinheiro");
        System.out.println("Valor: ");
        this.setValor(sc.nextDouble());
    }

    public void Info(){
        System.out.println("--------------------------------------");
        System.out.print("Tipo: " + this.getTipo());
        System.out.print("Valor: " + this.getValor());
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
