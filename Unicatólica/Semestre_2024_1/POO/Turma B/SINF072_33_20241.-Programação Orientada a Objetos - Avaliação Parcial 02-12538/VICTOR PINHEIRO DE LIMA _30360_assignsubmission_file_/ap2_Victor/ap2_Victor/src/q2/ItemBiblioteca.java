package q2;

public abstract class ItemBiblioteca {
	 private boolean disponivel;

	 public ItemBiblioteca() {
	     this.disponivel = true;
	 }

	 public void emprestarItem() {
	     if (disponivel) {
	         disponivel = false;
	         System.out.println("Item emprestado com sucesso!");
	     } else {
	         System.out.println("Item n�o est� dispon�vel para empr�stimo.");
	     }
	 }

	 public void devolverItem() {
	     disponivel = true;
	     System.out.println("Item devolvido com sucesso!");
	 }

	 public boolean isDisponivel() {
	     return disponivel;
	 }
	}