package JPMC;

import java.io.Serializable;

public class Printer <T extends Thread & Serializable>{

	T printer;
	
	public Printer(T printer) {
		this.printer = printer;
	}
	
	public void print() {
		System.out.println(printer);
	}
}
