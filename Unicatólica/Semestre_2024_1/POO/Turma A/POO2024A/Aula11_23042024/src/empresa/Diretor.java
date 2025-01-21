package empresa;

public class Diretor extends Funcionario{
	@override
	public double bonificacao() {
		return this.getSalario()*0.15;
	}
}
