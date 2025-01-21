package empresa;

public class Execucao {

	public static void main(String[] args) {
		Diretor d1 = new Diretor();
		Funcionario f1 = new Funcionario();
		
		d1.setNome("Ana");
		d1.setCpf("05897845");
		d1.setSalario(1000);
		System.out.println("Bonificação: "+d1.bonificacao());
		System.out.println("Salário + Bonificação: " + (d1.getSalario()+d1.bonificacao()));
	}
}
