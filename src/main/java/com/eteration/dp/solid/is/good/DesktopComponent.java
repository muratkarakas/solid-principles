package com.eteration.dp.solid.is.good;

public class DesktopComponent implements NonTouchUIComponent {

	public void mouseover(String event) {
		System.out.println("Mouse click Event Fired");

	}

	public void validate() {
		System.out.println("All UI is valid");
		
	}

}
