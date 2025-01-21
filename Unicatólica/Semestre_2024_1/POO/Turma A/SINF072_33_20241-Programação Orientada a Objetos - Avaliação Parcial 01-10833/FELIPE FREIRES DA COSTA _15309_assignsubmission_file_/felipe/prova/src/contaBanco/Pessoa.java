package contaBanco;

public class Pessoa {
	private String nome;
	private int Nconta;
	private double saldo;
	
	
	public Pessoa(String Nome, int Nconta, double saldoInicio) {
        this.nome = Nome;
        this.Nconta = Nconta;
        this.saldo = saldoInicio;
    }

    public void SaldoConsulta() {
        System.out.println("Saldo atual : R$ " + saldo);
    }

    public void Saque(double valor) {
    	if (saldo < valor) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else if(saldo > valor){
            System.out.println("Transferencia realizada! seu saldo atual : R$ " + saldo);
        }else{
        	System.out.println("ERRO!!!!");
        }
    }

    public void depositar(double valor) {
        if (saldo < valor + (valor * 0.05)) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valor + (valor*0.05);
            System.out.println("Transferência realizada! saldo atualizado : R$ " + saldo);
        }
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNconta() {
		return Nconta;
	}
	public void setNconta(int nconta) {
		Nconta = nconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
}
