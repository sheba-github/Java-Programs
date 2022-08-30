package practices;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);

     int len=0;
     String rev=" ";
     String s1;
     String og;

System.out.println("Please enter a string:");
s1=s.nextLine();
og=s1;
len=s1.length();
System.out.println("The length of the String is "+len);

for(int i=len-1;i>=0;i--)
{
rev=rev+s1.charAt(i);
}
System.out.println("The reverse string:"+rev);
if(og.equals(rev)) 
	System.out.println("The string is a palindrome");

else 
	
	System.out.println("The String is not a palindrome");

s.close();

}
}


	


