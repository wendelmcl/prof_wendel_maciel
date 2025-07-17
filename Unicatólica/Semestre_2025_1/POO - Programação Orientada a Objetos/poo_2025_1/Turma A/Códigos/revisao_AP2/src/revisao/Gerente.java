package revisao;

public class Gerente extends Funcionario implements Bonificavel{
	
	public Gerente(String nome, String matricula, double salarioBase) {
		super(nome, matricula, salarioBase);
	}

	@Override
	public double calcularBonus() {
		double bonus = 0.0;
		bonus = getSalarioBase() * (20.0 / 100.0);
		return bonus;
	}	
}
