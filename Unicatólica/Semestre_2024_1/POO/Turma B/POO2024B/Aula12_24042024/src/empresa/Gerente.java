package empresa;

public class Gerente extends Funcionario{
	
	public double bonificacao() {
		return this.getSalario()*0.20;
	}
}
