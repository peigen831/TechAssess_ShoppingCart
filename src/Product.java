
public class Product {
	public static final String p_ult_small = "ult_small";
	public static final String p_ult_medium = "ult_medium";
	public static final String p_ult_large = "ult_large";
	public static final String p_datapack1gb = "dp1gb";

	private String code;
	private String name;
	private int quantity;
	private double price;
	
	public Product(String code, String name, double price, int quantity){
		this.code  = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void addQuantity(){
		quantity++;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

