package empresa2;

public class Execucao {

	public static void main(String[] args) {
		//Funcionario f1 = new Funcionario();
		Diretor d1 = new Diretor();
		d1.setNome("Maria");
		d1.setCpf("054687");
		d1.setSalario(1000);
		System.out.println("Nome: "+d1.getNome());
		System.out.println("CPF: "+d1.getCpf());
		System.out.println("Salário: "+d1.getSalario());
		System.out.println("Bonificação: "+d1.bonificacao());
		System.out.println("Salário + Bonificação: "+(d1.getSalario()+d1.bonificacao()));
		
		

	}
}
