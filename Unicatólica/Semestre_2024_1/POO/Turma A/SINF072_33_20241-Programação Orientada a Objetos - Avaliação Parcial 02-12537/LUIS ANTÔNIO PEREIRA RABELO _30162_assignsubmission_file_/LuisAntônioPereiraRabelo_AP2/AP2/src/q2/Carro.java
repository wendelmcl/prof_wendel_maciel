package q2;

public class Carro implements Veiculo {
	private int id;
	
	@Override
	public void acelerar() {
		System.out.println("Carro acelerando");
	}

	@Override
	public void frear() {
		System.out.println("Carro freando");
	}

	@Override
	public void barulho() {
		System.out.println("Carro fazendo barulho");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
