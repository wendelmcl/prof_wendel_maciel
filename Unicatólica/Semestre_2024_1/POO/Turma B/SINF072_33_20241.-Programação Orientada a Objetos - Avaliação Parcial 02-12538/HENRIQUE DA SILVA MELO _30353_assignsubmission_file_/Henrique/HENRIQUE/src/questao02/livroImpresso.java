// Classe abstrata LivroImpresso
class LivroImpresso implements Livro {
	private boolean dispon�vel;
	
	public LivroImpresso(){
		this.dispon�vel = true;
	}
	
	public void emporestarItem() {
		if (disponivel){
			disponivel = false;
			System.out.println("Livro emprestado com sucesso.");
		}else{
			Syste,.out.println("Livro n�o est� dispon�vel para empr�stimo.");
			
	public void devolverItem() {
		disponivel = true;
		System.out.println("Livro devolvido com sucesso.");
	}
	
	public boolean consultarDisponibilidade(){
		return disponivel;
	}
}
		
	


