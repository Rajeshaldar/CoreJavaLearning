package list.arraylistClass.method.sort;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;

public class Sort {
	public static void main(String[] args) {
		ArrayList AL = new ArrayList();
		AL.add(10);
		AL.add(20);
		AL.add(23);
		AL.add(10);
		
		Collections.sort(AL);
		System.out.println(AL);
//		Collections.sort(AL, Collections.reverseOrder());
//		System.out.println(AL);
		
		
	}

}
