// Classe abstrata LivroImpresso
class LivroImpresso implements Livro {
	private boolean disponível;
	
	public LivroImpresso(){
		this.disponível = true;
	}
	
	public void emporestarItem() {
		if (disponivel){
			disponivel = false;
			System.out.println("Livro emprestado com sucesso.");
		}else{
			Syste,.out.println("Livro não está disponível para empréstimo.");
			
	public void devolverItem() {
		disponivel = true;
		System.out.println("Livro devolvido com sucesso.");
	}
	
	public boolean consultarDisponibilidade(){
		return disponivel;
	}
}
		
	


