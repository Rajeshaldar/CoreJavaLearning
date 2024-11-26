package map.Hashmap.Hashmap;
import java.util.*;

public class Hashmap {
	public static void main(String[] args) {
		HashMap H = new HashMap();
		
		H.put(1, "Sheela");
		H.put(2, 'C');
		H.put("abc", true);
		H.put('a', "Sheela");
		H.put(true, "Sheela");
		
		System.out.println(H);
		
		H.put(1, "Munni");
		System.out.println(H);		
	}
}
