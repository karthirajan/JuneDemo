package org.bank;

public class LocalBank implements IndianBank,IciciBank{

	@Override
	public void carLoan() {
		System.out.println("car loan % is 8");
		
	}

	@Override
	public void bikeLoan() {
		System.out.println("bike loan % is 9");
		
	}

	@Override
	public void homeLoan() {
		System.out.println("home loan % is 10");
		
	}
	
	@Override
	public void dummy() {
		System.out.println("dummy");
		
	}

	public static void main(String[] args) {
		LocalBank loc = new LocalBank();
		loc.carLoan();
		loc.bikeLoan();
		loc.homeLoan();
	}




}
