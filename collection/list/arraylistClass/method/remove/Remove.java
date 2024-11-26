package list.arraylistClass.method.remove;

import java.util.ArrayList;

public class Remove {
	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(null);
		AL.add('C');
		
		System.out.println(AL); //[10, 20, null, C]
		
		System.out.println(AL.remove(2)); //null removed
		
		System.out.println(AL); //[10, 20, C]	
	}
}
