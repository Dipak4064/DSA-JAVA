package ArrayList;

import java.util.ArrayList;

public class FunctionOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();
        // ArrayList<Double> list3 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 50);
        System.out.println(list);

        // get operation
        int element = list.get(1);
        System.out.println(element);

        // set operation
        list.set(1, 180);
        System.out.println(list);

        // remove operation
        list.remove(1);
        System.out.println(list);

        // contain operation
        System.out.println(list.contains(30));
        System.out.println(list.contains(100));

        // size operation
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // printing reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();



        // finding the maximum element
        System.out.println("Original list");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        // swap two elements
        System.out.println(list);
        swap(list, 0, 2);
        System.out.println(list);

    }

    // swaping two element by using the Arraylist
    public static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }    
}
