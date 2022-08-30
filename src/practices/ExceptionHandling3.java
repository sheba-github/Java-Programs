package practices;

public class ExceptionHandling3 {

	public static void main(String[] args) {
try {
	System.out.println("Inside Try block");
	throw new RuntimeException("Test");
}
catch(Exception e){
	System.out.println("InsideCatch");
	e.printStackTrace();
	System.out.println("ExceptionMessage");
	
	e.getMessage();
	}

finally{
	System.out.println("Inside finally");
	
}
		
		
	}

	}
