package non_Static.Main_Method.QSpider;

public class Main {
	void main(String Loc)
	{
		System.out.println("Location is: " + Loc);
	}
	void main(long mob)
	{
		System.out.println("Mobile number: " + mob);
	}
	void main( String tech1, String tech2)
	{
		System.out.println("Teachers names: " + tech1 + " and " + tech2);
	}

	public static void main(String[] args) 
	{
		Main Q = new Main ();
		Q.main("Kolkata");
		Q.main(9740499372L);
		Q.main("SKR sir", "Sachin Sir");
	}

}
