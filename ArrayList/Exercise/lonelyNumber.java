package ArrayList.Exercise;

import java.util.HashMap;

public class lonelyNumber {
    public static void main(String[] args) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(7, 10);
        mp.put(3, 5);
        mp.put(9, 11);
        System.out.println(mp.get(7));
        System.out.println(mp.get(3));
        System.out.println(mp.get(9));

    }
}
