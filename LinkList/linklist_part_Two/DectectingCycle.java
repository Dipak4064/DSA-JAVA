package LinkList.linklist_part_Two;

public class DectectingCycle {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DectectingCycle list = new DectectingCycle();
        head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);
        head.next.next.next.next.next = head;
        System.out.println(isCycle());

    }
}
