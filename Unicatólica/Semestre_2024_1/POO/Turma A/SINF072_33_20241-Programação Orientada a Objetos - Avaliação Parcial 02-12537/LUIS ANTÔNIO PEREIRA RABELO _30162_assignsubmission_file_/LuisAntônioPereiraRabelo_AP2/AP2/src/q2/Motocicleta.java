package q2;

public class Motocicleta implements Veiculo {
	private int id;
	@Override
	public void acelerar() {
		System.out.println("Motocicleta acelerando.");
	}

	@Override
	public void frear() {
		System.out.println("Motocicleta freando");
	}

	@Override
	public void barulho() {
		System.out.println("Motocicleta fazendo barulho");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
