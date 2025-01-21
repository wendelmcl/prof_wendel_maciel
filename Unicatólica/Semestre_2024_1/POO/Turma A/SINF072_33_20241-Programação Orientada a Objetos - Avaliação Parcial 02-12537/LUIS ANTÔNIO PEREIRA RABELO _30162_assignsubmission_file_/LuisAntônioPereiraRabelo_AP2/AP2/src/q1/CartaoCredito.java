package q1;

public class CartaoCredito extends FormaPagamento {
	private int numcred;
	private int CVCcred;
	private String datavenccred;
	
	public int getNumcred() {
		return numcred;
	}
	public void setNumcred(int numcred) {
		this.numcred = numcred;
	}
	public int getCVCcred() {
		return CVCcred;
	}
	public void setCVCcred(int cVCcred) {
		CVCcred = cVCcred;
	}
	public String getDatavenccred() {
		return datavenccred;
	}
	public void setDatavenccred(String datavenccred) {
		this.datavenccred = datavenccred;
	}
	
	
}
