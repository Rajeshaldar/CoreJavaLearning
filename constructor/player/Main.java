package player;

public class Main {
	String name, country;
	int age, run;
	
	Main (String pname, String pcountry, int page, int prun)
	{
		name = pname;
		country = pcountry;
		age = page;
		run = prun;
	}
		
	public static void main(String[] args) 
	{
		Main P = new Main("MSD", "IND", 43, 10773);
		System.out.println ("Name of the player: "+P.name);
		System.out.println ("Country: "+P.country);
		System.out.println ("Age of the player: "+P.age);
		System.out.println ("Total run: "+P.run);
	}

}
