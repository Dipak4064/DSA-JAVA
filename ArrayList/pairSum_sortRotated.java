package ArrayList;

import java.util.ArrayList;

public class pairSum_sortRotated {
    public static boolean rotatedSorted_parsum(ArrayList<Integer> list, int target) {

        // Finding the Breaking Point
        int pivotPoint = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivotPoint = i;
                break;
            }
        }

        int Right = pivotPoint;
        int Left = pivotPoint + 1;
        while (Right != Left) {
            if (list.get(Right) + list.get(Left) == target) {
                System.out.println(Right + "," + Left);
                return true;
            }
            if (list.get(Right) + list.get(Left) < target) {
                Left = (Left + 1) % list.size();
            }
            if (list.get(Right) + list.get(Left) > target) {
                Right = (list.size() * Right - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(rotatedSorted_parsum(list, target));
    }
}
