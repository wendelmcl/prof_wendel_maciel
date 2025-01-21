package q2;

import q2.Biblioteca.Livro;

public class Itembiblioteca {
	public class LivroImpresso implements Livro {
	    private String titulo;
	    private boolean emprestado;

	    public LivroImpresso(String titulo) {
	        this.titulo = titulo;
	        this.emprestado = false;
	    }

	    
	    public void emprestarItem() {
	        if (!emprestado) {
	            System.out.println("O livro '" + titulo + "' foi emprestado.");
	            emprestado = true;
	        } else {
	            System.out.println("O livro '" + titulo + "' já está emprestado.");
	        }
	    }

	    public void devolverItem() {
	        if (emprestado) {
	            System.out.println("O livro '" + titulo + "' foi devolvido.");
	            emprestado = false;
	        } else {
	            System.out.println("O livro '" + titulo + "' já está disponível na biblioteca.");
	        }
	    }
	   
	    public void consultarDisponibilidade() {
	        if (emprestado) {
	            System.out.println("O livro '" + titulo + "' está emprestado no momento.");
	        } else {
	            System.out.println("O livro '" + titulo + "' está disponível na biblioteca.");
	        }
	    }

	    public void adicionarExemplar() {
	        System.out.println("Novo exemplar do livro '" + titulo + "' foi adicionado à biblioteca.");
	    }
	}
}

	
