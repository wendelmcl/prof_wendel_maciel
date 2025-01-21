package questao02;

class Carro implements Veiculo {
	 @Override
	 public void acelerar() {
	     System.out.println("Carro acelerando...");
	 }

	 @Override
	 public void frear() {
	     System.out.println("Carro freando...");
	 }

	 @Override
	 public void fazerBarulho() {
	     System.out.println("O carro está fazendo barulho!");
	 }
	}
