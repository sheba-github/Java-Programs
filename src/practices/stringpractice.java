package practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringpractice {

	public static void main(String[] args) throws IOException {
System.out.println("Enter a string and a number");
BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
String str= reader.readLine();
String s=reader.readLine();
int a=Integer.parseInt(s);
if(a>0) {	
while(a>0) {
	System.out.println(str);
	a--;
}}
else 
	System.out.println("Invalid number and cannot run loop");

	

	}}
