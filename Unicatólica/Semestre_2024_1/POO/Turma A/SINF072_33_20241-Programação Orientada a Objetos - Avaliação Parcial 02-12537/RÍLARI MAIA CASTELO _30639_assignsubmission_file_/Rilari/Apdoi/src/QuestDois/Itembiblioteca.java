package QuestDois;

public class Itembiblioteca {
public void emprestarIntem(){
	
}
@Override
public void emprestarItem() {

System.out.println("Livro emprestado com sucesso");
}

@Override
public void devolverItem() {

System.out.println("Livro devolvido");
}

@Override
public void consultar() {

System.out.println("Livro impresso disponível para empréstimo");
}
}


class DVD implements DVD {
@Override
public void emprestarItem() {

System.out.println("DVD emprestado");
}

@Override
public void devolverItem() {

System.out.println("DVD devolvido");
}

@Override
public void gravarDVD() {

System.out.println("DVD gravado");
}



}

