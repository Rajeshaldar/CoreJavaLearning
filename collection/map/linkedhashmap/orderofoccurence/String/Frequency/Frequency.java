package map.linkedhashmap.orderofoccurence.String.Frequency;
import java.util.*;
import java.util.Map.Entry;

public class Frequency {
	public static void main(String[] args) {
		String S = "Qspiders";
		char[] ch = S.toCharArray();
		LinkedHashMap <Character, Integer> LM = new LinkedHashMap();
		for(char key : ch) {
			boolean res = LM.containsKey(key);
			if(res == true) {
				int count = LM.get(key);
				count++;
				LM.put(key, count);
			}
			else {
				LM.put(key, 1);
			}
//			System.out.println(LM);	
		}
//		System.out.println(LM);
		for(Entry<Character, Integer> e : LM.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
