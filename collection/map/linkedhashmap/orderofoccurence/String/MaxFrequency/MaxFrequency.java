package map.linkedhashmap.orderofoccurence.String.MaxFrequency;
import java.util.*;
import java.util.Map.Entry;

public class MaxFrequency {
	public static void main(String[] args) {
		String S = "Qspiders";
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
		char key=0;
		int value=0;
		for(Entry <Character, Integer> e : LM.entrySet()) {
			if(e.getValue()>value) {
				value = e.getValue();
				key = e.getKey();
			}
		}
		System.out.println(key+" : "+value);
	}
}
