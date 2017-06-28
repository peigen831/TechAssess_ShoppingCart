import java.util.HashMap;

public class PriceRules {

	
	public static final double d_ult_large = 39.90;
	
	
	public double computeTotal(HashMap<String, Product> productList, PromoCode promo){
		
		double total = 0;
//		RULE 1
		int nSmall = productList.get(Product.p_ult_small).getQuantity();
		nSmall = (nSmall / 3 * 2) +(nSmall % 3);
		total += (nSmall * productList.get(Product.p_ult_small).getPrice());
		
//		RULE 2
		int nLarge = productList.get(Product.p_ult_large).getQuantity(); 
		if(nLarge > 3)
			total += (nLarge * d_ult_large);
		else
			total += (nLarge * productList.get(Product.p_ult_large).getPrice());
			
		//COMPUTE NOMRAL ITEM
		total += productList.get(Product.p_ult_medium).getPrice() * productList.get(Product.p_ult_medium).getQuantity();
		total += productList.get(Product.p_datapack1gb).getPrice() * productList.get(Product.p_datapack1gb).getQuantity();

		
//		RULE 4
		if(promo!=null)
			if(promo.getPromoCode().equals(PromoCode.discount10p))
				total *= 0.9;
		
		return total;
		
	}
	
	public HashMap<String, Product> computeFreebie(HashMap<String, Product> productList, PromoCode promo){
//		RULE 3
		HashMap<String, Product> promoProduct = ShoppingCart.initialProduct();
		int nQuantity = productList.get(Product.p_ult_medium).getQuantity();
		if(nQuantity > 0)
			promoProduct.get(Product.p_datapack1gb).setQuantity(nQuantity);

		return promoProduct;
		
	}
}
