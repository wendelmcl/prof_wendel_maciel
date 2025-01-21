package revisao02;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Carlos");
		g1.setCpf("057999-01");
		g1.setSalario(2000);
		g1.imprimirInformacoes();
		g1.calcularSalario();
		g1.calcularSalario();
		g1.calcularSalario();
		g1.calcularSalario();
		g1.imprimirInformacoes();
	}
}
