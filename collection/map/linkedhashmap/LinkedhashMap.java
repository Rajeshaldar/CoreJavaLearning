package map.linkedhashmap;
import java.util.*;

public class LinkedhashMap {
	public static void main(String[] args) {
		LinkedHashMap LH = new LinkedHashMap();
		LH.put(1, "Sheela");
		LH.put(2, 'C');
		LH.put("abc", true);
		LH.put('a', "Sheela");
		LH.put(true, "Sheela");
		
		System.out.println(LH);
	}
		
}
