package java_basics;

public class StringConcepts {

public static void main(String[] args) {

	// String method - length
		String s = " Hello World ";
		System.out.println("The real String " + s);
//String method - charAt
		char charInString = s.charAt(1);
		System.out.println("Character in String " + charInString);
//String method - trim
		String s1 = s.trim();
		System.out.println("The string using trim " + s1);
//String method- equals
		boolean flag = s.equals(" Hello world ");
		System.out.println("The value of flag is " + flag);
//String method - equalsIgnoreCase
		boolean flag1 = s.equalsIgnoreCase(" Hello world ");
		System.out.println("The value of flag1 is " + flag1);
//String method - contains
		boolean flag2 = s.contains("Word");
		System.out.println("The value of Flag2 " + flag2);
//String method - concat
		String str = "Learn Automation";
		String s2 = s.concat(str);
		System.out.println(s2);
//String method - Uppercase
		String str1 = s2.toUpperCase();
		System.out.println(str1);
	}

}
