package exemplos;

public class AddStrategy implements Strategy {
	public int execute(int a, int b) {
		return a + b;
	}
}