package heranca;

public class Execucao {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro("Cachorro",10,"Raca1");
		Gato g1 = new Gato("Gato", 2, "Raca2");
		c1.mostrar_info();
		g1.mostrar_info();
	}
}
