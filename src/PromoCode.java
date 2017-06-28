
public class PromoCode {
	
	public static final String discount10p = "I<3AMAYSIM"; 
	
	private String promoCode;
	private String validDate;
	
	public PromoCode(String code){
		this.promoCode = code;
	}
	
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromCode(String promCode) {
		this.promoCode = promCode;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
}
