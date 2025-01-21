package item04.banco;

public class Conta {
    private int id;
    private String nome;
    private Double saldo;

    public Conta(int id, String nome, Double saldo) {
        setId(id);
        setNome(nome);
        setSaldo(saldo);
    }

    public void realizarSaque(Double valor) {
        if (sacar(valor)) {
            System.out.println("\nValor sacado com Sucesso!\n");
        } else {
            System.out.println("\nSaldo insuficiente!\n");
        }
    }

    public void realizarDeposito(Double valor) {
        if (isPositive(valor)) {
            System.out.println("\nValor depositado com sucesso!\n");
        } else {
            System.out.println("\nErro: Valor Inválido!\n");
        }
    }

    public void verificarSaldo() {
        System.out.printf("\nSaldo atual: %.2f\n", getSaldo());
    }

    private Boolean isPositive(Double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            return true;
        } else {
            return false;
        }
    }

    private Boolean sacar(Double valor) {
        if (valor > getSaldo()) {
            return false;
        } else {
            setSaldo(saldo - valor);
            return true;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

}
