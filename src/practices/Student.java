package practices;

public class Student {

	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.getStuData(12345, "Sheba");
		stu1.getStuMarks(40, 30, 50);
		stu1.totalMarks();
		Student stu2 = new Student();
		stu2.getStuData(54678, "Saravanan");
		stu2.getStuMarks(70, 80, 90);
		stu2.totalMarks();
		
		
	}

	public void getStuData(int sid, String name) {
		SID = sid;
		Sname = name;
	}

	public void getStuMarks(int mark1, int mark2, int mark3) {
		Sub1 = mark1;
		Sub2 = mark2;
		Sub3 = mark3;

	}

	public void totalMarks() {
		int totalMarks = Sub1 + Sub2 + Sub3;
		System.out.println("Student details: " + SID + " " + Sname);
		System.out.println("Total marks " + totalMarks);
	}

}
