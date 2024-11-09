package inheritance.SingleLevel.Student;

public class Student extends Dept{
	String Sname = "Rajesh Haldar";
	void info ()
	{
		System.out.println("Student Name: "+Sname);
		System.out.println("Dept: "+dept);
		System.out.println("Semester: "+sem);
	}

}
