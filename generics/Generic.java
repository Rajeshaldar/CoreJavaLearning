package generics.Generic;
import java.util.*;

public class Generic {
	public static void main(String[] args) {
		ArrayList <Integer> A = new ArrayList();
		A.add(10);
		A.add(20);
		A.add(9);
		A.add(50);
		
		System.out.println(A);
		
		for(int i : A) {
			System.out.println(i);
		}
	}
	

}
