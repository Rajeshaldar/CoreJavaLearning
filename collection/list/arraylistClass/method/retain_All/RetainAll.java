package list.arraylistClass.method.retain_All;

import java.util.ArrayList;

public class RetainAll {
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
		
		AL.retainAll(AL2);
		System.out.println(AL); //[20, C]
	}

}
