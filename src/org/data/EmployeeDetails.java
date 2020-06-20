package org.data;

public final class EmployeeDetails {
	
	
    final int pin=10;
	public final static void empId(int id) {
		
		System.out.println("Employee id is :"+id);
        
	}
	
	public void empName(String name) {
	  
		System.out.println("emp name is :"+pin);

	}
	
	public void empPhno(long phno) {
		
		System.out.println("emp phno is :"+pin);

	}
	
	public void empSal(float sal) {
		
		System.out.println("emp sal is :"+sal);

	}
	
	public void empMail(String mail) {

       System.out.println("emp mail id is :"+mail);

	}
	
	public void empGen(char gen) {
		
		System.out.println("emp gender is :"+gen);

	}
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		empId(567654);
		emp.empName("karthi");
		emp.empSal(56778);
		emp.empMail("karthi2@gmail.com");
		emp.empPhno(4265443425262l);
		emp.empGen('M');
	}
	

}
