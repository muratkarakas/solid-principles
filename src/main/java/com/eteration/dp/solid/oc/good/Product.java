package com.eteration.dp.solid.oc.good;

public abstract class Product {
	
	
	private double basePrice;
	
	public abstract double calculateTaxIncludedPrice();

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

}
