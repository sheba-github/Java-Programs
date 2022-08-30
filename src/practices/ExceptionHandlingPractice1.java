package practices;

public class ExceptionHandlingPractice1 {

	public static void main(String[] args) {
		try {
int a=10;
int j=a/0;

System.out.println("inside try block");
System.out.println("The value of j :"+j);
		}
catch(NullPointerException e)
		{
	
	e.printStackTrace();
	System.out.println(e.getMessage());
		}
finally {
	
	System.out.println("Inside finally block");
	
}
	
}
	}


