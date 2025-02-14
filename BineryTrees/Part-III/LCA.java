import java.util.ArrayList;

public class LCA {
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

    // finding path from root to n
    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    // finding of lowest common ancestor
    public static Node lca(Node root, int n1, int n2) {// TC: O(n) SC: O(n)
        // This approach1 is not efficient as it is taking O(n) space
        if (root == null) {
            return null;
        }
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        // last common element in both paths is the LCA
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
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
        int n1 = 4, n2 = 7;
        // System.out.println(lca(root, n1, n2).data);
        System.out.println(lca2(root, n1, n2).data);

    }
}
