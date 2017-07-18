package com.eteration.dp.solid.oc.good;

public class ElectrnicDevice extends Product{

	@Override
	public double calculateTaxIncludedPrice() {
		
		return getBasePrice()*1.18;
	}

}
