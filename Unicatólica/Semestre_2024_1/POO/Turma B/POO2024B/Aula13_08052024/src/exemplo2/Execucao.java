package exemplo2;

public class Execucao {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Maria");
		g1.setIdade(20);
		g1.setSalario(1300);
		g1.imprimirInformacoes();
		int resultado = 0;
		resultado = g1.incremetaIdade(g1.getIdade());
		System.out.println("Idade Incrementada: "+resultado);
	}
}
