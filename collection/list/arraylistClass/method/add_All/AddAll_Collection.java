package list.arraylistClass.method.add_All;

import java.util.ArrayList;

public class AddAll_Collection {
	public static void main(String[] args) {
		//Create new ArrayList object
		ArrayList AL = new ArrayList();
		
		//void add(Object obj)
		AL.add("Munni");
		AL.add("Munna");
		AL.add("Baby");
		AL.add("Sona");

		//Create another ArrayList object
		ArrayList AL2 = new ArrayList();
		AL2.add("Sheela");
		AL2.add("Uski");
		AL2.add("jawani");
		
		System.out.println(AL); //[Munni, Munna, Baby, Sona]
		AL.add(AL2);
		System.out.println(AL); //[Munni, Munna, Baby, Sona, [Sheela, Uski, jawani]]
		
		
	}
}
		

