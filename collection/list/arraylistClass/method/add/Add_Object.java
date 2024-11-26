package list.arraylistClass.method.add;

import java.util.ArrayList;

public class Add_Object {
	public static void main(String[] args) {
		
		//Create new ArrayList object
		ArrayList AL = new ArrayList();
		
		//void add(Object obj)
		AL.add(10);
		AL.add(20);
		AL.add('C');
		AL.add(null);
		AL.add(null);
		AL.add(10);
		AL.add(true);
		AL.add("Sheela");
		
		//Void get(int index)
		//return the elements at the specified position in this list
		System.out.println(AL.get(5)); //10
		
		System.out.println(AL); //[10, 20, C, null, null, 10, true, Sheela]
	}
}
