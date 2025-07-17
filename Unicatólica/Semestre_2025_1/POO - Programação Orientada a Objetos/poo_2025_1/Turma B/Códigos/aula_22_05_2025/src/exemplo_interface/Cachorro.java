package exemplo_interface;

public class Cachorro implements Animal{

	@Override
	public void mover() {
		System.out.println("Cachorro andando...");
	}

	@Override
	public void comer() {
		System.out.println("Cachorro comendo...");
	}
}
