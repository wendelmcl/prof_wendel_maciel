package q1;

public class Loja {
	public Loja(String[] args) {
	class Geladeira extends Eletrodomestico {
	    private int capacidade;

	    
	    public Geladeira(String marca, double preco, String modelo, int capacidade) {
	        super(marca, modelo, preco);
	        this.setCapacidade(capacidade);
	    }

	    
	    public double calcularGarantiaEstendida() {
	       
	        return preco * 0.1; // 
	    }


		@Override
		public double calculoGarantiaEstendida() {
			
			return 0;
		}


		public int getCapacidade() {
			return capacidade;
		}


		public void setCapacidade(int capacidade) {
			this.capacidade = capacidade;
		}

	}

	class TV extends Eletrodomestico {
	    private String resolucao;

	    
	    public TV(String marca, double preco, String modelo, String resolucao) {
	        super(marca, modelo, preco);
	        this.setResolucao(resolucao);
	    }

	    
	    public double calcularGarantiaEstendida() {
	        
	        return preco * 0.08; // Exemplo simples: 8% do preço
	    }


		@Override
		public double calculoGarantiaEstendida() {
			// TODO Auto-generated method stub
			return 0;
		}


		public String getResolucao() {
			return resolucao;
		}


		public void setResolucao(String resolucao) {
			this.resolucao = resolucao;
		}

	    
	}
   }
}
