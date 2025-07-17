package exemplo_interface;

public interface Animal {
	
	void mover();
	void comer();
	
	default void dormir() {
		System.out.println("O animal está dormindo...");
	}
}
