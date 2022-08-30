package java_basics;

import java.util.Scanner;

public class DisplayNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("1");
		String a= scan.nextLine();
		System.out.println("2");
		String b=scan.nextLine();
		System.out.println( a +","+ b);
		scan.close();
	}

}
