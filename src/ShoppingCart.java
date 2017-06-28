import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
	
	private Customer customer;
	private HashMap<String, Product> cartProduct;
	private HashMap<String, Product> promoProduct;
	private PriceRules rules;
	
	private double totalPrice;
//	private double discount;
	private PromoCode promoCode;
	
	
	
	public void add(String productCode){
//		Product p = cartProduct.get(productCode);
//		p.addQuantity();
//		cartProduct.put(productCode, p);
		cartProduct.get(productCode).addQuantity();
		applyRule();
	}
	
	public void add(String productCode, PromoCode code){
		cartProduct.get(productCode).addQuantity();
		promoCode = code;
		applyRule();
	}
	
	public void setPromo(PromoCode promo){
		promoCode = promo;
	}
	
	
	private void applyRule(){
		totalPrice = rules.computeTotal(cartProduct, promoCode);
		promoProduct = rules.computeFreebie(cartProduct, promoCode);
	}
	
	public void printTotal(){
		System.out.printf("$%.2f\n", totalPrice);
	}
	
	public void printItems(){
		for(Map.Entry<String, Product> product: cartProduct.entrySet())
		{
			String key = product.getKey();
			if(product.getValue().getQuantity() > 0 || promoProduct.get(key).getQuantity() > 0)
			{
				int nTotal = product.getValue().getQuantity() + promoProduct.get(key).getQuantity();
				System.out.println(nTotal + " x " + product.getValue().getName());
			}
		}
	}
	
	public ShoppingCart(PriceRules rules){
		this.rules = rules;
		cartProduct = initialProduct();
		promoProduct = initialProduct();
	}	
	
	public static HashMap<String, Product> initialProduct(){
		HashMap<String, Product> productList = new HashMap<String, Product>();
		
		productList.put(Product.p_ult_small, new Product(Product.p_ult_small, "Unlimited 1GB", 24.90, 0));
		productList.put(Product.p_ult_medium, new Product(Product.p_ult_medium, "Unlimited 2GB", 29.90, 0));
		productList.put(Product.p_ult_large, new Product(Product.p_ult_large, "Unlimited 5GB", 44.90, 0));
		productList.put(Product.p_datapack1gb, new Product(Product.p_datapack1gb, "1 GB Data-pack", 9.90, 0));
		
		return productList;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
