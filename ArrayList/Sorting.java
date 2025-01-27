package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(3);
        list.add(90);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);// ascending order
        System.out.println(list);

        // desending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // 2D arrayList
        System.out.println("2D arrayList");
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        ArrayList<Integer> arr3 = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++) {
            arr1.add(i); // 1 2 3 4 5
            arr2.add(i * 2); // 2 4 6 8 10
            arr3.add(i * 3); // 3 6 9 12 15
        }
        list1.add(arr1);
        list1.add(arr2);
        list1.add(arr3);
        arr1.remove(3);//this will remove the element at index 3 which 4
        arr1.remove(3);//this will remove the element at index 3 which 5

        for (int i = 0; i < list1.size(); i++) {
            // System.out.println(list1.get(i));//this one way to print the 2D arrayList
            ArrayList<Integer> currentE = list1.get(i);
            for (int j = 0; j < currentE.size(); j++) {
                System.out.print(currentE.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(list1);

    }
}
