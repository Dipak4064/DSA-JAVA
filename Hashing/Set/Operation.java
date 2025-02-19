package Set;

import java.util.HashSet;

public class Operation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        if (set.contains(2)) {
            System.out.println("2 is present");
        } else {
            System.out.println("2 is not present");
        }
        System.out.println("size is " + set.size());
        set.clear();
        System.out.println(set.isEmpty());
    }
}
