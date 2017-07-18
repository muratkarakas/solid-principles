package com.eteration.dp.solid.is.bad;

public class AndroidComponent implements Component {

	

	public void mouseover(String event) {
		throw new UnsupportedOperationException("mouse click not supported");

	}

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
