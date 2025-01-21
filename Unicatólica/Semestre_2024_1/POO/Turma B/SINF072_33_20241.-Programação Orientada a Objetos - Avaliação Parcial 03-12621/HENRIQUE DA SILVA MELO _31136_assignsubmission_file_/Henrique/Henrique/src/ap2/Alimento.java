package ap2;

public class Alimento extends Produto implements Entregavel

{   private double peso;

    public Alimento(String codigo, String descricao, double peso) {
    	super(codigo, descricao);
    	this.peso = peso;
    	
    	public String getCodigo() {
    		return codigo;
    		
    	public String getDescricao(){
    		return descricao;
    		
    		public double calcularFrete() {
    			
    			if (peso <= 1.0) {
    				return 5.0;
    		{else{
    			return 5.0 + (peso - 1.0) * 2.0;
    			
    			
    		public static void main(String[] args) {
    			
    			Alimento pizza = new Alimento("001, "Pizza", 1.5);"
    					
    					
    			System.out.println("Código do produto: " + pizza.getCodigo());
    			System.out.println("Descrição do produto: " + pizza.getDescricao());
    			System.out.println("Valor do frete: R$" + pizza.calcularFrete());
    		}		
    				
    	}
    		
    			
    		
    	
    	
    


