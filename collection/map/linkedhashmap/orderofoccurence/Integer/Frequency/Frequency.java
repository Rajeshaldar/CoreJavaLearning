package map.linkedhashmap.orderofoccurence.Integer.Frequency;
import java.util.*;
import java.util.Map.Entry;

public class Frequency {
    public static void main(String[] args) {
        int[] a = {3, 4, 3, 2, 3, 6, 4};
        LinkedHashMap<Integer, Integer> LM = new LinkedHashMap<>();
        
        // Iterate through the array
        for (int key : a) {
            // Check if the current element is already a key in the map
            boolean res = LM.containsKey(key);
            
            // If the key is present, increment its value (count)
            if (res==true) {
                int count = LM.get(key);
                count++;
                LM.put(key, count);
            } else {
                // If the key is not present, add it with a value of 1
                LM.put(key, 1);
            }
            // System.out.println(LM);
        }
        
        // Print the final frequency count of each element
        for (Entry<Integer, Integer> e : LM.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

