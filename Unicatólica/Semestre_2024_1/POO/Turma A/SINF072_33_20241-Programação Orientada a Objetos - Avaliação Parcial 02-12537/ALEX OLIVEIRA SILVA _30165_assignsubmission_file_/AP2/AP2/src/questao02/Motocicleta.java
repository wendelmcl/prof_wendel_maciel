package questao02;

class Motocicleta implements Veiculo {
	 @Override
	 public void acelerar() {
	     System.out.println("Motocicleta acelerando...");
	 }

	 @Override
	 public void frear() {
	     System.out.println("Motocicleta freando...");
	 }

	 @Override
	 public void fazerBarulho() {
	     System.out.println("A motocicleta está fazendo barulho!");
	 }
	}
