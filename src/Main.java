public class Main {
	


	public static void main(String[] args) {
		PriceRules rules = new PriceRules();
		ShoppingCart cart = new ShoppingCart(rules);
		
//		SCENARIO 1
//		cart.add(Product.p_ult_small);
//		cart.add(Product.p_ult_small);
//		cart.add(Product.p_ult_small);
//		cart.add(Product.p_ult_large);

		
//		SCENARIO 2
//		cart.add(Product.p_ult_small);
//		cart.add(Product.p_ult_small);
//		cart.add(Product.p_ult_large);
//		cart.add(Product.p_ult_large);
//		cart.add(Product.p_ult_large);
//		cart.add(Product.p_ult_large);
		

//		SCENARIO 3
//		cart.add(Product.p_ult_small);
//		cart.add(Product.p_ult_medium);
//		cart.add(Product.p_ult_medium);
		
//		SCENARIO 4
		PromoCode code = new PromoCode(PromoCode.discount10p);
		cart.add(Product.p_ult_small);
		cart.add(Product.p_datapack1gb, code);
		
		cart.printTotal();
		cart.printItems();
	}

}
