package java_basics;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		
		System.out.println("Enter the radius");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		double area=2*3.14*radius;
		System.out.println("The Area of circle: "+ area);
		input.close();

	}

}
