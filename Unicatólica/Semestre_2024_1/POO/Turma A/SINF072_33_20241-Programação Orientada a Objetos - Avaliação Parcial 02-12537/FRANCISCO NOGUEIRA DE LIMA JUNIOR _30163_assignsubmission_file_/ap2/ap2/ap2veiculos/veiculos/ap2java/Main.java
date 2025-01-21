package ap2java;


 import java.util.ArrayList;



	interface Veiculo {
	    void acelerar();
	    void frear();
	    void fazerBarulho();
	}

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
	        System.out.println("Vrum Vrum!");
	    }
	}

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
	        System.out.println("Rrrrraaaah!");
	    }
	}

	class Caminhao implements Veiculo {
	    @Override
	    public void acelerar() {
	        System.out.println("Caminhão acelerando...");
	    }

	    @Override
	    public void frear() {
	        System.out.println("Caminhão freando...");
	    }

	    @Override
	    public void fazerBarulho() {
	        System.out.println("Vruuuuuum!");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        ArrayList<Veiculo> corrida = new ArrayList<>();
	        corrida.add(new Carro());
	        corrida.add(new Motocicleta());
	        corrida.add(new Caminhao());

	        for (Veiculo veiculo : corrida) {
	            System.out.println("Veículo em ação:");
	            veiculo.acelerar();
	            veiculo.fazerBarulho();
	            veiculo.frear();
	            System.out.println();
	        }
	    }
	}


