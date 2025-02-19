package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetOperation {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("KTM");
        cities.add("LALITPUR");
        cities.add("BKT");
        cities.add("LALITPUR");
        System.out.println("HashSet:");
        System.out.println(cities);
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("KTM");
        linkedHashSet.add("LALITPUR");
        linkedHashSet.add("BKT");
        linkedHashSet.add("LALITPUR");
        System.out.println("LinkedHashSet:");
        System.out.println(linkedHashSet);
        
    }
}
