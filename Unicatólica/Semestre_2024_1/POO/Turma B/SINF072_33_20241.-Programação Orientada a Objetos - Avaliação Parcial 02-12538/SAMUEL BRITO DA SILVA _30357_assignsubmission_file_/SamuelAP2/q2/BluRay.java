package q2;

public class BluRay implements DVD {

    @Override
    public void emprestarItem() {
        System.out.println("Item Emprestado!");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'emprestarItem'");
    }

    @Override
    public void devolverItem() {
        System.out.println("Item Devolvido!");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'devolverItem'");
    }

    @Override
    public void gravarDVD() {
        System.out.println("300 discos para gravação disponíveis");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gravarDVD'");
    }
    
}
