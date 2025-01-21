// Classe concreta DVD
class DVDImp1 implements DVD {
	private boolean disponivel;
	
	public DVDIm1() {
		this.disponivel = true;
	}
	
	public void emprestarItem() {
		if (disponivel) {
			disponivel = false;
			System.out.println("DVD emprestado com sucesso.");
		}else}
	       System.out.println("DVD não está disponivel para empréstimo.");
		}
	}
	
	public void devolverItem(){
		disponivel = true;
		System.out.println("DVD devolvido com sucesso.");
	}
	
	public void gravarDVD() {
		System.out.println("Gravando conteúdo no DVD.");
	}
}



