package java_basics;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Automation";
		int len = str.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

//String result = new StringBuffer(str).reverse().toString();
//System.out.println(result);
	}

}
