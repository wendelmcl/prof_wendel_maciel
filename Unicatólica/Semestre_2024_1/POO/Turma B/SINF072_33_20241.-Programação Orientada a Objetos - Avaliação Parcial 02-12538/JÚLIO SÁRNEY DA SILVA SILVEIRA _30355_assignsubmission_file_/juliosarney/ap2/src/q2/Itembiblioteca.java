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
	            System.out.println("O livro '" + titulo + "' j� est� emprestado.");
	        }
	    }

	    public void devolverItem() {
	        if (emprestado) {
	            System.out.println("O livro '" + titulo + "' foi devolvido.");
	            emprestado = false;
	        } else {
	            System.out.println("O livro '" + titulo + "' j� est� dispon�vel na biblioteca.");
	        }
	    }
	   
	    public void consultarDisponibilidade() {
	        if (emprestado) {
	            System.out.println("O livro '" + titulo + "' est� emprestado no momento.");
	        } else {
	            System.out.println("O livro '" + titulo + "' est� dispon�vel na biblioteca.");
	        }
	    }

	    public void adicionarExemplar() {
	        System.out.println("Novo exemplar do livro '" + titulo + "' foi adicionado � biblioteca.");
	    }
	}
}

	
