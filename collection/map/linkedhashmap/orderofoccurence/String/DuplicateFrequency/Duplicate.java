package map.linkedhashmap.orderofoccurence.String.DuplicateFrequency;
import java.util.*;
import java.util.Map.Entry;

public class Duplicate {
	public static void main(String[] args) {
		String S = "Qspppiders";
		char[] ch = S.toCharArray();
		LinkedHashMap <Character, Integer> LM = new LinkedHashMap();
		for(char key : ch) {
			boolean res = LM.containsKey(key);
			if(res==true) {
				int count = LM.get(key);
				count++;
				LM.put(key, count);
			}
			else {
				LM.put(key, 1);
			}
		}
		for (Entry <Character, Integer> e : LM.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey()+" : "+e.getValue());
			}
		}	
	}
}
