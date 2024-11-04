package employee;

public class Main {
	String name, job;
	int empno, mgr, sal;
	
	Main (String Name, String Job, int Empno, int Mgr, int Sal)
	{
		name = Name;
		job = Job;
		empno = Empno;
		mgr = Mgr;
		sal = Sal;
	}
	public static void main(String[] args) 
	{
		Main E = new Main ("Smith", "Clerk", 7369, 7902, 800);
		System.out.println("Name of employee: "+E.name);
		System.out.println("Designation is: "+E.job);
		System.out.println("Employee number: "+E.empno);
		System.out.println("Manager name: "+E.mgr);
		System.out.println("Employee's salay: "+E.sal+" Rs");
	}
}
