package Map;
import java.util.HashMap;
import java.util.Set;

public class Operation {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        // Insert - O(1)
        hm.put("india", 100);
        hm.put("usa", 200);
        hm.put("uk", 300);
        hm.put("china", 400);
        System.out.println(hm);
        // Get - O(1)
        int population = hm.get("india");
        System.out.println(population);
        // ContainsKey - O(1)
        System.out.println(hm.containsKey("india"));
        System.out.println(hm.containsKey("nepal"));
        // ContainsValue - O(n)
        System.out.println(hm.containsValue(100));
        System.out.println(hm.containsValue(500));
        // Remove - O(1)
        System.out.println(hm.remove("india"));
        System.out.println(hm);
        // Size - O(1)
        System.out.println(hm.size());
        // //isEmpty - O(1)
        // System.out.println(hm.isEmpty());
        // //KeySet - O(n)
        // System.out.println(hm.keySet());
        // //Values - O(n)
        // System.out.println(hm.values());
        // //EntrySet - O(n)
        // System.out.println(hm.entrySet());

        // Clear - O(1)
        // hm.clear();
        // System.out.println(hm);

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(key + "->" + hm.get(key));
        }

    }

}
