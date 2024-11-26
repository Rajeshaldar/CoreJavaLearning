package queue.linkedList;
import java.util.*;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		L.add(null);
		L.add(20);
		L.add(10);
		L.add('C');
		L.add("Sheela");
		L.add(null);
		L.add(10);
		
		System.out.println(L.peek());
		System.out.println(L);
		
		System.out.println(L.poll());
		System.out.println(L);
	}

}
