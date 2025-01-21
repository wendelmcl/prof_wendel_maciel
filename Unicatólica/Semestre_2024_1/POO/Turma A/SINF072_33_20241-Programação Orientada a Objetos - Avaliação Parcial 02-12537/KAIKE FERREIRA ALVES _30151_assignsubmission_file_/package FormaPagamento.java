package FormaPagamento;

public class CartaoDebito {

    
}
 
import java.util.ArrayList;

	abstract class CartaoDebito {
		 protected String Ndocartao;
		    protected String CdeSegurança;
		    protected String DdeVencimento;	

	    public CartaoDebito(String Ndocartao, String CdeSegurança, String DdeVencimento) {
	        this.Ndocartao = Ndocartao;
	        this.CdeSegurança = CdeSegurança;
	        this.DdeVencimento = DdeVencimento;
	  
	    }
	    
	    }
	    
	   
