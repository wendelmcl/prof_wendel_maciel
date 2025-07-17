package exemplo_interface;

public interface Animal {
	
	abstract void mover();
	abstract void comer();
	
	default void dormir() {
		System.out.println("O animal está dormindo...");
	}
}
