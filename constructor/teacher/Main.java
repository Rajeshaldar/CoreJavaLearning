package teacher;

public class Main {
	String name, subject;
	int age, exp;
	
	Main (String Name, String Subject, int Age, int Exp)
	{
		name = Name;
		subject = Subject;
		age = Age;
		exp = Exp;
	}
	
	public static void main(String[] args) 
	{
		Main T = new Main ("Sachin S.Y", "Core Java", 29, 5);
		System.out.println("Name of trainer: "+T.name);
		System.out.println("Name of subject: "+T.subject);
		System.out.println("Age of trainer: "+T.age);
		System.out.println("Total experience in field: "+T.exp);
	}

}
