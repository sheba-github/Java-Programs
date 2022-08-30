package practices;

public class CheckedException {

	public static void main(String[] args) throws ArithmeticException  {
		CheckedException obj=new CheckedException();
		
		obj.sum();
		obj.div();
	}

	public void sum() throws ArithmeticException {
		div();
	}

   public void div() throws ArithmeticException {
	   int i=10/0;
	   System.out.println(i);
   }
}

