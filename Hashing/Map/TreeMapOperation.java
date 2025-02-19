package Map;
import java.util.HashMap;
import java.util.TreeMap;
public class TreeMapOperation {

    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 135);
        tm.put("China", 200);
        tm.put("US", 40);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("US", 40);
        System.out.println(tm);//based on key
        System.out.println(hm);
    }
}
