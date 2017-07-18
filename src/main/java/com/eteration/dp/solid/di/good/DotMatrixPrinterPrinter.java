package com.eteration.dp.solid.di.good;

public class DotMatrixPrinterPrinter implements Printer {
	private String inc;

	public String getInc() {
		return inc;
	}

	public void setInc(String inc) {
		this.inc = inc;
	}
	
	

	public void print(String text){
		System.out.println(text);
	}
	
}
