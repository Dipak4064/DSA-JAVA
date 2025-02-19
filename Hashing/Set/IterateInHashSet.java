package Set;

import java.util.HashSet;
import java.util.Iterator;

public class IterateInHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("KTM");
        cities.add("LALITPUR");
        cities.add("BKT");
        cities.add("LALITPUR");
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for(String city: cities){
            System.out.println(city);
        }
    }
}
