public class mirrorBST {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node left = createMirror(root.left);
        Node right = createMirror(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        // to make the tree of values[] array
        /*
         *       8
         *      / \
         *     5   10
         *    / \   \
         *   3   6  11 
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        /*
         *       8
         *      / \
         *     10  5
         *    /   / \
         *   11  6   3
         */
        Node mirror = createMirror(root);
        preOrder(mirror);
    }

}
