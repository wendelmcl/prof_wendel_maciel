package q2;

public class Execucao_q2 {

	public static void main(String[] args) {
		AddVeiculos a1 = new AddVeiculos();
		Carro c1 = new Carro();
		Motocicleta m1 = new Motocicleta();
		Caminhao n1 = new Caminhao();
		Carro c2 = new Carro();
		Motocicleta m2 = new Motocicleta();
		Caminhao n2 = new Caminhao();
		c1.setNome("Carro Preto");
		c2.setNome("Carro Vermelho");
		m1.setNome("Moto Preto");
		m2.setNome("Moto Vermelho");
		n1.setNome("Caminhao Preto");
		n2.setNome("Caminhao Vermelho");
		
		a1.adicionar(c1);
		a1.adicionar(m1);
		a1.adicionar(n1);
		a1.adicionar(c2);
		a1.adicionar(m2);
		a1.adicionar(n2);
		
		a1.imprimircaminhoes();
		a1.imprimircarros();
		a1.imprimirmotos();
		a1.imprimircaminhoes();
		a1.imprimircarros();
		a1.imprimirmotos();

		
		
	

	}

}
