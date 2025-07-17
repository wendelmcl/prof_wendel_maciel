package exemplo_interface;

public class Cachorro implements Animal{

	@Override
	public void mover() {
		System.out.println("O cachorro está correndo...");
	}

	@Override
	public void comer() {
		System.out.println("O cachorro está comendo...");
	}
}