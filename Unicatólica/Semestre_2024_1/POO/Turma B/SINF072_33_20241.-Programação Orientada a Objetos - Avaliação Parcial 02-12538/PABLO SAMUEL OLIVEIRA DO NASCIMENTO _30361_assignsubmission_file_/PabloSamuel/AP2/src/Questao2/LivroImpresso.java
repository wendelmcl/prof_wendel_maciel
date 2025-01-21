package Questao2;

public class LivroImpresso implements Livro {
	 private boolean disponivel = true;
	 
@Override
public void emprestarItem() {
	 if (disponivel) {
	 disponivel = false;
	 System.out.println("Livro emprestado com sucesso!");
	 } else {
	 System.out.println("Livro não está disponível para empréstimo.");
	 }
}

@Override
public void devolverItem() {
	disponivel = true;
    System.out.println("Livro devolvido com sucesso!");
}

@Override
public void consultarDisponibilidade() {
	if (disponivel) {
        System.out.println("Livro disponível para empréstimo.");
    } else {
        System.out.println("Livro não está disponível para empréstimo.");
    }
}

}
