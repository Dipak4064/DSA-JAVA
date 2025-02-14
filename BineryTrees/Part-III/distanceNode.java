
public class distanceNode {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node lca2(Node root, int n1, int n2) {// TC: O(n) SC: O(1)
        // This approach2 is efficient as it is taking O(1) space
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);
        // if (leftlca != null && rightlca != null) {
        //     return root; // If both left and right are not null, root is the LCA
        // }
        // return (leftlca != null) ? leftlca : rightlca;
        if(rightlca ==null){
            return leftlca;
        }
        if(leftlca == null){
            return rightlca;
        }
        return root;
    }
    public static int lcaDist(Node lca, int n) {
        if (lca == null) {
            return -1;
        }
        if (lca.data == n) {
            return 0;
        }
        int left = lcaDist(lca.left, n);
        int right = lcaDist(lca.right, n);
        if (left == -1 && right == -1) {
            return -1;
        }else if(left == -1){
            return 1 + right;
        }else{
            return 1 + left;
        }
    }
    public static int minDistance(Node root, int n1, int n2) {
        Node lca = lca2(root, n1, n2);
        int d1 = lcaDist(lca, n1);
        int d2 = lcaDist(lca, n2);
        return d1 + d2;
    }
    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        System.out.println(minDistance(root, n1, n2));
    }
}
