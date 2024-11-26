package list.arraylistClass.method.size;

import java.util.ArrayList;

public class Size {
	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(null);
		AL.add('C');
		
		System.out.println(AL.size()); //4
	}
}
