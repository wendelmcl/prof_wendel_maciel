package revisao;

public class Estagiario extends Funcionario implements Bonificavel{
	
	public Estagiario(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public double calcularBonus() {
		// TODO Auto-generated method stub
		return 0.0;
	}
}
