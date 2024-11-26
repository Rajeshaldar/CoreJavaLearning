package list.arraylistClass.method.contains;

import java.util.ArrayList;

public class Contains {
	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(null);
		AL.add('C');
		
		System.out.println(AL.contains(20)); //true
		System.out.println(AL.contains("Sheel")); //false
	}

}
