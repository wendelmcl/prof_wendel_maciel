package q1;

public class CartaoDebito extends FormaPagamento{
	private int numdeb;
	private int CVCdeb;
	private String datavencdeb;
	
	public int getNumdeb() {
		return numdeb;
	}
	public void setNumdeb(int numdeb) {
		this.numdeb = numdeb;
	}
	public int getCVCdeb() {
		return CVCdeb;
	}
	public void setCVCdeb(int cVCdeb) {
		CVCdeb = cVCdeb;
	}
	public String getDatavencdeb() {
		return datavencdeb;
	}
	public void setDatavencdeb(String datavencdeb) {
		this.datavencdeb = datavencdeb;
	}
	
	
}
