package java_basics;

public class Calculator {

	public static void main(String[] args) {

		addition();
		addition(10, 30);
		int sum = add(10, 10) + 30;
		System.out.println("The method with return statment " + sum);

		multiply(40, 60);
		sub(40, 50);
		divide(10, 40);
	}

	public static void addition() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);

	}

	public static void addition(int a, int b) {
		int c = a + b;
		System.out.println("The method with arguments: " + c);

	}

	public static int add(int b, int c) {
		int d = b + c;
		return d;
	}

	public static void multiply(int e, int f) {
		int g = e * f;
		System.out.println(g);

	}

	public static void sub(int h, int b) {
		int a = h - b;
		System.out.println("Subtraction " + a);

	}

	public static void divide(int a, int b) {
		int c = a / b;
		System.out.println("Division " + c);
	}
}
