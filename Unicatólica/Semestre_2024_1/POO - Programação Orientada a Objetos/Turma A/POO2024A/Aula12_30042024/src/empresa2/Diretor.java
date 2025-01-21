package empresa2;

public class Diretor extends Funcionario{

	@Override
	public double bonificacao() {
		return this.getSalario()*0.30;
	}
}
