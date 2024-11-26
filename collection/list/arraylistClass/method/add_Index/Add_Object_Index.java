package list.arraylistClass.method.add_Index;

import java.util.ArrayList;

public class Add_Object_Index {
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
		
		System.out.println(AL); //[10, 20, C, null, null, 10, true, Sheela]
		
		//Void add(int index, Object obj)
		//Used to add/append the elements into collection based on the specified index
		AL.add(2, "Munni"); 
		
		System.out.println(AL); //[10, 20, Munni, C, null, null, 10, true, Sheela]
	}

}
