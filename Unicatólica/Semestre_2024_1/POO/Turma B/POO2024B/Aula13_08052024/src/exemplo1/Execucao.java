package exemplo1;

public class Execucao {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Gerente g1 = new Gerente();
		g1.setNome("Ana");
		g1.setIdade(30);
		g1.setSalario(1200);
		g1.imprimirInformacoes();
		System.out.println("Idade incrementada: "+g1.incrementarIdade(g1.getIdade()));
	}
}
