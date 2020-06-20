package org.cons;

public class EmpDetails {
	
	public EmpDetails() {
		this(4566);
		System.out.println("super constructor");
		
	}	
	
	public EmpDetails(int id) {
		
		System.out.println("super arg constructor :"+id);
		
	}

}
