package revisao03;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Gerente g2 = new Gerente();
		CRUD c1 = new CRUD();
		
		g1.setId(1);
		g1.setNome("Ana");
		g1.setCpf("265454-68");
		g1.setSalario(2000);
		
		
		g2.setId(2);
		g2.setNome("Marcos");
		g2.setCpf("2654365-78");
		g2.setSalario(2000);
		c1.adicionar(g1);
		c1.adicionar(g2);
		c1.imprimirInformacoes();
		c1.pesquisar(1);
		c1.atualizar(2);
		c1.imprimirInformacoes();
		c1.deletarGerente(2);
		c1.imprimirInformacoes();
	}
}
