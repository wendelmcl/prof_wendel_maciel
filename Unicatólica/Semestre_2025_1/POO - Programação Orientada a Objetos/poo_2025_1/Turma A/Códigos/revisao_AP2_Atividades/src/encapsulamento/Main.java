package encapsulamento;

public class Main {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.setDia(10);
		d1.setMes(5);
		d1.setAno(2025);
		System.out.println("Data: "+d1.getDia()+"/"+d1.getMes()+"/"+d1.getAno());
		d1.avancarDia();
		System.out.println("\nData: "+d1.getDia()+"/"+d1.getMes()+"/"+d1.getAno());
		
	}
}
