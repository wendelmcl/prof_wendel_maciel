package Questao2;

public class LivroImpresso implements Livro {
	 private boolean disponivel = true;
	 
@Override
public void emprestarItem() {
	 if (disponivel) {
	 disponivel = false;
	 System.out.println("Livro emprestado com sucesso!");
	 } else {
	 System.out.println("Livro n�o est� dispon�vel para empr�stimo.");
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
        System.out.println("Livro dispon�vel para empr�stimo.");
    } else {
        System.out.println("Livro n�o est� dispon�vel para empr�stimo.");
    }
}

}
