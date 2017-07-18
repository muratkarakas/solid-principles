package com.eteration.dp.solid.oc.good;

import java.util.List;

public class ShoppingCartService {
	
	public double calculateTotalOrder(List<Product> products){

		
		double orderTotal = 0;
		
		
		for (Product product : products) {
			
			
			orderTotal+=product.calculateTaxIncludedPrice();
		}
		
		return orderTotal;
	}

}
