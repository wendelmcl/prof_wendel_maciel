package empresa;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setId(1);
		g1.setNome("Maria");
		g1.setSalario(1200);
		
		g1.calcularSalario();
		g1.imprimirInformacoes();
		
		
		
	}
}
