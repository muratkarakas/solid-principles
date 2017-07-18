package com.eteration.dp.solid.is.bad;

public class DesktopComponent implements Component {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");

	}

	public void touch(String event) {
		throw new UnsupportedOperationException("touch not supported");


	}

	public void swipe(String event) {
		throw new UnsupportedOperationException("swipe not supported");


	}
	
	public void validate() {
		System.out.println("All UI is valid");
		
	}

}
