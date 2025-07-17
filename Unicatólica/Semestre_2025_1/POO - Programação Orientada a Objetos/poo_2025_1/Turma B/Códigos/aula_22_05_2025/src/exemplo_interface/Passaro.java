package exemplo_interface;

public class Passaro implements Animal{

	@Override
	public void mover() {
		System.out.println("Pássaro voando...");
		
	}

	@Override
	public void comer() {
		System.out.println("Pássaro comendo...");
	}
	
	public void dormir() {
		System.out.println("O pássaro está dormindo...");
	}
	
}
