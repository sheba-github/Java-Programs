package java_basics;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		System.out.println("Enter the principal,interest rate and the years ");
		Scanner input = new Scanner(System.in);
		int principal = input.nextInt();
		int interest_rate = input.nextInt();
		int years=input.nextInt();
		
		double simple_interest = (principal *interest_rate*years)/100;
		System.out.println("The simple interest is: "+ simple_interest);
		input.close();
		
	}

}
