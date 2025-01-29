package LinkList.linklist_part_Two;

import java.util.LinkedList;

public class LLFrameWork {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> list = new LinkedList<>();
        // add
        list.addLast(1);
        list.addLast(2);
        list.addFirst(0);
        // get
        System.out.println(list);
        // remove
        list.removeLast();
        list.removeFirst();
        System.out.println(list);
    }
}
