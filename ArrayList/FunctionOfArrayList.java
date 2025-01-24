package ArrayList;

import java.util.ArrayList;

public class FunctionOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(1, 50);
        System.out.println(list);
        //get operation
        int element = list.get(1);
        System.out.println(element);
        //set operation
        list.set(1,180);
        System.out.println(list);
        //remove operation
        list.remove(1);
        System.out.println(list);
        //contain operation
        System.out.println(list.contains(30));
        System.out.println(list.contains(100));
        //size operation
        System.out.println(list.size());

    }
}
