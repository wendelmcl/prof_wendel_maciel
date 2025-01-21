package ap2java;


import java.util.ArrayList;
import java.util.Scanner;

abstract class FormaPagamento {
    protected String tipo;
    protected double valor;

    public FormaPagamento(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public abstract void gerarRecibo();
}

class CartaoCredito extends FormaPagamento {
    private String numero;
    private String codigoSeguranca;
    private String dataVencimento;

    public CartaoCredito(String tipo, double valor, String numero, String codigoSeguranca, String dataVencimento) {
        super(tipo, valor);
        this.numero = numero;
        this.codigoSeguranca = codigoSeguranca;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo - Cart�o de Cr�dito");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("N�mero do Cart�o: " + numero);
        System.out.println("Data de Vencimento: " + dataVencimento);
    }
}

class CartaoDebito extends FormaPagamento {
    private String numero;

    public CartaoDebito(String tipo, double valor, String numero) {
        super(tipo, valor);
        this.numero = numero;
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo - Cart�o de D�bito");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("N�mero do Cart�o: " + numero);
    }
}

class Boleto extends FormaPagamento {
    private String codigoDeBarras;

    public Boleto(String tipo, double valor, String codigoDeBarras) {
        super(tipo, valor);
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo - Boleto");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("C�digo de Barras: " + codigoDeBarras);
    }
}

class Dinheiro extends FormaPagamento {
    private String tipoDinheiro;

    public Dinheiro(String tipo, double valor, String tipoDinheiro) {
        super(tipo, valor);
        this.tipoDinheiro = tipoDinheiro;
    }

    @Override
    public void gerarRecibo() {
        System.out.println("Recibo - Dinheiro");
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: " + valor);
        System.out.println("Tipo de Dinheiro: " + tipoDinheiro);
    }
}

public class banco {
    public static void main(String[] args) {
        ArrayList<FormaPagamento> formasPagamento = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha a forma de pagamento (cartao_credito / cartao_debito / boleto / dinheiro): ");
            String escolha = scanner.nextLine();
            switch (escolha.toLowerCase()) {
                case "cartao_credito":
                    System.out.println("Informe o n�mero do cart�o: ");
                    String numeroCredito = scanner.nextLine();
                    System.out.println("Informe o c�digo de seguran�a: ");
                    String codigoSeguranca = scanner.nextLine();
                    System.out.println("Informe a data de vencimento: ");
                    String dataVencimento = scanner.nextLine();
                    formasPagamento.add(new CartaoCredito("Cart�o de Cr�dito", 100.0, numeroCredito, codigoSeguranca, dataVencimento));
                    break;
                case "cartao_debito":
                    System.out.println("Informe o n�mero do cart�o: ");
                    String numeroDebito = scanner.nextLine();
                    formasPagamento.add(new CartaoDebito("Cart�o de D�bito", 50.0, numeroDebito));
                    break;
                case "boleto":
                    System.out.println("Informe o c�digo de barras: ");
                    String codigoBarras = scanner.nextLine();
                    formasPagamento.add(new Boleto("Boleto", 200.0, codigoBarras));
                    break;
                case "dinheiro":
                    System.out.println("Informe o tipo de dinheiro (nota/moeda): ");
                    String tipoDinheiro = scanner.nextLine();
                    formasPagamento.add(new Dinheiro("Dinheiro", 150.0, tipoDinheiro));
                    break;
                default:
                    System.out.println("Op��o inv�lida!");
            }
        }

       
        for (FormaPagamento forma : formasPagamento) {
            forma.gerarRecibo();
            System.out.println("-------------------------");
        }
        
        scanner.close();
    }
}

