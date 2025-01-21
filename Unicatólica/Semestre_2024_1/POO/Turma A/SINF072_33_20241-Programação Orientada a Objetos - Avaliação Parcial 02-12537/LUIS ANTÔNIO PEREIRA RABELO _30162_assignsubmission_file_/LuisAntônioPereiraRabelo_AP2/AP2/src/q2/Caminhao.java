package q2;

public class Caminhao implements Veiculo{
	private int id;
	@Override
	public void acelerar() {
		System.out.println("Caminhão acelerando");
	}

	@Override
	public void frear() {
		System.out.println("Caminhão freando");
	}

	@Override
	public void barulho() {
		System.out.println("Caminhã fazendo barulho");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
