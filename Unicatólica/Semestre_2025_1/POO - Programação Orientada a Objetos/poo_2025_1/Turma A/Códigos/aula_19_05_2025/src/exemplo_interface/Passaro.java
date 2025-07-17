package exemplo_interface;

public class Passaro implements Animal{
	
	@Override
	public void mover() {
		System.out.println("O pássaro está voando...");
		
	}

	@Override
	public void comer() {
		System.out.println("O pássaro está comendo...");
	}
	
	public void dormir() {
		System.out.println("O pássaro está dormindo...");
	}
	

}
