package org.data;

import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your pin");
		int pin = scan.nextInt();
		System.out.println("pin no is :"+pin);
		
		System.out.println("choose account type");
		String acc = scan.next();
		System.out.println("acc type is :"+acc);
		
		System.out.println("enter withdrawl amount");
		float amt = scan.nextFloat();
		System.out.println("amt is :"+amt);
		
		System.out.println("enter your phno");
		long phno = scan.nextLong();
		System.out.println("phno no is :"+phno);
		
		System.out.println("confirm here");
		boolean b = scan.nextBoolean();
		System.out.println(b);
	}
	
}
