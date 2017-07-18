package com.eteration.dp.solid.di.bad;

public class PrinterDesk {
	private DotMatrixPrinterPrinter printer;

	public PrinterDesk(DotMatrixPrinterPrinter printer) {
		super();
		this.printer = printer;
	}
	
	
	public void printFile(){
		printer.print("File Content");
	}
	
}
