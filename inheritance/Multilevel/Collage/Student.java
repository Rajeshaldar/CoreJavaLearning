package inheritance.Multilevel.Collage;

public class Student extends Dept{
	String name = "Rajesh Haldar";
	public void ID()
	{
		System.out.println("Student name: " + name);
		System.out.println("Depertment name: "+ dept);
		System.out.println("Semester : " + Sem);
		System.out.println("Collage name: " + clg);
	}
}
