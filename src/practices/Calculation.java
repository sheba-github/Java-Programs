package practices;

public class Calculation {
	int Num1;
	int Num2;
	int Num3;
	
public Calculation(int NumOne,int NumTwo, int NumThree){
	Num1=NumOne;
	Num2=NumTwo;
	Num3=NumThree;
}
public void sum() {
int sum=Num1 +Num2 +Num3;
System.out.println("The Sum of three numbers "+sum);
}
	public static void main(String[] args) {
		Calculation obj1= new Calculation(1,2,3);
		obj1.sum();
		
		
	}

}
