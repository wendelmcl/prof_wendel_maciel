package empresa;

public class Gerente extends Funcionario{
	@override
	public double bonificacao() {
		return this.getSalario()*0.20;
	}	
}
