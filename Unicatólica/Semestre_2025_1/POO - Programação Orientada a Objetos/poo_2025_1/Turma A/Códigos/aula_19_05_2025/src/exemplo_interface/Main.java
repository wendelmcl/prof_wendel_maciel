package exemplo_interface;

public class Main {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		Animal passaro = new Passaro();
		System.out.println("--- Cachorro ---");
		cachorro.comer();
		cachorro.mover();
		cachorro.dormir();
		System.out.println("--- Pássaro ---");
		passaro.comer();
		passaro.mover();
		passaro.dormir();

	}
}
