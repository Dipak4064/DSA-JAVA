package Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 135);
        lhm.put("China", 200);
        lhm.put("US", 40);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("US", 40);
        System.out.println(lhm);
        System.out.println(hm);
    }
}