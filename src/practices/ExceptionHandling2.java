package practices;

public class ExceptionHandling2 {

	public static void main(String[] args) {
try {
int a[]= new int[10];
System.out.println(a[11]);
}
catch(ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
	e.getMessage();
}
finally {
	System.out.println("In finally block");
}
}
	}


