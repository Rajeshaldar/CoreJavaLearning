package list.arraylistClass.method.remove_All;

import java.util.ArrayList;

public class RemoveAll {
	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(null);
		AL.add('C');
		
		ArrayList AL2 = new ArrayList();
		AL2.add(20);
		AL2.add('C');
		AL2.add("Sheela");
		
		System.out.println(AL2); //[20, C, Sheela]
		
		AL.removeAll(AL2);
		
		System.out.println(AL);// [10, null]
		System.out.println(AL2);
	}

}
