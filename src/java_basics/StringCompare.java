package java_basics;

public class StringCompare {

	public static void main(String[] args) {
		String str1 = "Hello World!";
		String str2 = "Hello World!";
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Both Strings are equal");
		} else
			System.out.println("Both the Strings are not equal");
		String str3 = new String("Hello World!");
		if (str1 == str3)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
