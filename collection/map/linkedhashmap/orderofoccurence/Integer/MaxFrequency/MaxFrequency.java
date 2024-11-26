package map.linkedhashmap.orderofoccurence.Integer.MaxFrequency;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {3, 4, 3, 2, 3, 6, 4};
        LinkedHashMap<Integer, Integer> LM = new LinkedHashMap<>();
        for (int key : arr) {
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
        }

        // Initially assuming that key=0 and value=0 is max
        int key = 0;
        int value = 0;
        
        // Iterate through the map entries to find the key with the highest value
        for (Entry<Integer, Integer> e : LM.entrySet()) {
            // Check if the current entry's value is greater than the max value found so far
            if (e.getValue() > value) {
                value = e.getValue();
                key = e.getKey();
            }
        }
        
        // Print the key with the maximum frequency
        System.out.println(key + " : " + value);
    }
}

