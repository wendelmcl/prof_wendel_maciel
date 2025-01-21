package exemplo2;

public class Circulo extends FiguraGeometrica{
	private double raio;
	private double PI = 3.14;
	
	public double calcularArea() {
		return PI*(raio*raio);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}
}
