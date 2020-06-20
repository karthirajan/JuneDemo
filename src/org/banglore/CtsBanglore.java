package org.banglore;

public class CtsBanglore {
	
	public void ctsEmployee1() {
		
		System.out.println("employee from cts banglore");

	}
	
	public void ctsEmployee2() {
		
		System.out.println("employee 2 from cts banglore");

	}
	
	private void dummy() {
		
        System.out.println("dummy method");
	}
	
	public static void main(String[] args) {
		CtsBanglore bang = new CtsBanglore();
		bang.ctsEmployee1();
		bang.ctsEmployee2();
	}

}
