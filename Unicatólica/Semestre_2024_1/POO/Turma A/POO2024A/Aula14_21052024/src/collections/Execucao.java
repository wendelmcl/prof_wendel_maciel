package collections;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Gerente g2 = new Gerente();
		Crud c1 = new Crud();
		g1.setId(1);
		g1.setNome("Maria");
		g1.setSalario(3000);
		
		g2.setId(2);
		g2.setNome("Carlos");
		g2.setSalario(3000);
		
		c1.cadastrarGerente(g1);
		c1.cadastrarGerente(g2);
		c1.imprimirInformacoes();
		c1.pesquisarGerente(1);
		c1.pesquisarGerente(100);
		c1.atualizarGerente(2);
		c1.imprimirInformacoes();
		c1.deletarGerente(2);
		c1.imprimirInformacoes();
	}
}
