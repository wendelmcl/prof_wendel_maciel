package exemplo1;

public class Adulto extends Pessoa{

	@Override
	public int incrementarIdade() {
		int result = 0;
		result = this.getIdade();
		return result+1;
	}
}
