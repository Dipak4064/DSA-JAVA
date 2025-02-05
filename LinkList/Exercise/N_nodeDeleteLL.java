package LinkList.Exercise;

public class N_nodeDeleteLL {
    /**
     * Definition for ListNode
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    // public class ListNode {
    //     int val;
    //     ListNode next;

    //     ListNode(int x) {
    //         val = x;
    //         next = null;
    //     }
    // }

    // public static ListNode ogHead;
    //  public static ListNode ogTail;

    // public ListNode deleteNodes(ListNode head, int m, int n) {
    //     // --- write your code here ---

    //     ListNode dummy = new ListNode(-1);
    //     ogHead = dummy;
    //     ogTail = dummy;
    //     int M = m;
    //     int N = n;
    //     ListNode curr = head;
    //     while (curr != null) {
    //         curr = addNodes(curr, m, ogHead, ogTail);
    //         while (N > 0 && curr != null) {
    //             curr = curr.next;
    //         }
    //         N = n;
    //     }
    //     return dummy.next;
    // }

    // public void addNodes(ListNode curr, int m, ListNode ogHead, ListNode ogTail) {
    //     while (curr != null && m > 0) {
    //         ListNode currkaNext = curr.next;
    //         curr.next = null;
    //         addLast(ogHead, ogTail, curr);
    //         curr = currkaNext;
    //         m--;
    //     }
    // }

    // public void addLast(ListNode ogHead, ListNode ogTail, ListNode data) {
    //     ogTail.next = curr;
    //     ogTail = curr;
    // }

    // public static void main(String[] args) {

    // }
}
