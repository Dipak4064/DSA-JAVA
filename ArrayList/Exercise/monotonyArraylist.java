package ArrayList.Exercise;

import java.util.ArrayList;

public class monotonyArraylist {
    public static boolean monotonyFinder(ArrayList<Integer> list) {
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                increasing = true;
            }
            if (list.get(i) < list.get(i + 1)) {
                decreasing = true;
            }

        }
        if (increasing == true && decreasing == true)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(3);
        System.out.println(monotonyFinder(list));
    }
}
