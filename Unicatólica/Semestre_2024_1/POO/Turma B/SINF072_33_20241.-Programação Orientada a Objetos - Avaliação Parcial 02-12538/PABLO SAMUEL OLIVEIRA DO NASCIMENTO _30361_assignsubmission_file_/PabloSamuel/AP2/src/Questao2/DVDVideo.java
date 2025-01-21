package Questao2;

public class DVDVideo implements DVD{
	private boolean disponivel = true;
	
	
@Override
public void emprestarItem() {
	if (disponivel) {
        disponivel = false;
        System.out.println("DVD emprestado com sucesso!");
    } else {
        System.out.println("DVD não está disponível para empréstimo.");
    }
}

@Override
public void devolverItem() {
	 disponivel = true;
     System.out.println("DVD devolvido com sucesso!");
}

@Override
public void gravarDVD() {
	System.out.println("Gravando DVD...");
}

}
