package com.eteration.dp.solid.is.good;

public class AndroidComponent implements TouchUIComponent {

	


	public void touch(String event) {
		System.out.println("Touch Event Fired");

	}

	public void swipe(String event) {
		System.out.println("Swipe Event Fired");

	}

	public void validate() {
		System.out.println("All UI is valid");
		
	}

}
