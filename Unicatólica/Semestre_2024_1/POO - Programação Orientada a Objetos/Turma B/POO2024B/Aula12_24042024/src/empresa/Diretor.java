package empresa;

public class Diretor extends Funcionario{
	
	public double bonificacao() {
		return this.getSalario()*0.15;
	}
}
