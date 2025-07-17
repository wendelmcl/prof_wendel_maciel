package exemplo_interface;

public class Main {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		Animal passaro = new Passaro();
		System.out.println("---Cachorro---");
		cachorro.mover();
		cachorro.comer();
		cachorro.dormir();
		System.out.println("---Pássaro---");
		passaro.mover();
		passaro.comer();
		passaro.dormir();
	}
}
