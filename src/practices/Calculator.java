package practices;

public class Calculator implements C,D {

	public static void main(String[] args) {
Calculator obj= new Calculator();
obj.sum();
obj.mul();
		
	}

	public void sum() {
		int sum = a+b;
		System.out.println(sum);
		
	}
	public void mul() {
		int mul = x*y;
		System.out.println(mul);
		
	}

}
