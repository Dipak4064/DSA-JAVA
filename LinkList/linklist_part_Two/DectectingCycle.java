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

    // Remove the Cycle
    public static void removeCycle() {
        // detect the cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        // find the meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove the cycle last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        DectectingCycle list = new DectectingCycle();
        head = list.new Node(1);
        Node temp = list.new Node(2);
        head.next = temp;
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list.new Node(5);
        head.next.next.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());

    }
}