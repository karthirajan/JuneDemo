package org.poly;

public class EmployeeDetails {
	
	public void emp() {
		
		System.out.println("method name is emp");

	}
	
	public void emp(int id) {
		
		System.out.println("emp id is :"+id);

	}
	
	public void emp(String name) {
		
		System.out.println("emp name is :"+name);

	}
	
	public void emp(float sal) {
		
		System.out.println("emp sal is :"+sal);

	}
	
	public void emp(String mail,long phno) {
		
		System.out.println("emp mail is :"+mail);
		System.out.println("emp phno is :"+phno);

	}
	
	public void emp(String address,int doorNo) {
		
		System.out.println("emp add is :"+address);
		System.out.println("emp door no is :"+doorNo);

	}
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.emp();
		emp.emp(4567);
		emp.emp(45678);
		emp.emp("karthi");
		emp.emp("chennai", 14);
		emp.emp("karthi@gmil.com", 45678888888l);
	}
	

}
