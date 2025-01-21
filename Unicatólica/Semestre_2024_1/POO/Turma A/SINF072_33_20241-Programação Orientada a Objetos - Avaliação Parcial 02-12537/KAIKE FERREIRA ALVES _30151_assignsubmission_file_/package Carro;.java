package Carro;

	import java.util.ArrayList;
	
	public class carro {

	class Carro {
	    protected String acelerar;
	    protected String frear;
	    protected String fazerbarulho;	
	    
	    
	    public Carro(String acelerar, String frear, String fazerbarulho) {
	        this.acelerar = acelerar;
	        this.frear = frear;
	        this.fazerbarulho = fazerbarulho; 
	    }
    
	 public void exibirInformacoes() {
        System.out.println("Acelerar: " + acelerar);
        System.out.println("Frear " + frear);
        System.out.println("FazerBarulho " + fazerbarulho);
       
	 		}
	 }
	
	


