public class SubTree {
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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (subroot == null) {
            return true;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        boolean left = isSubtree(root.left, subroot);
        boolean right = isSubtree(root.right, subroot);
        return left || right;
    }
    public static boolean isIdentical(Node root, Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        if(root == null || subroot == null){
            return false;
        }
        if(root.data != subroot.data){
            return false;
        }
        // boolean left = isIdentical(root.left, subroot.left);
        // boolean right = isIdentical(root.right, subroot.right);
        // return left && right;
        if(!isIdentical(root.left, subroot.left)){
            return false;
        }
        if(!isIdentical(root.right, subroot.right)){
            return false;
        }
        return true;
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

        /*
         * 2
         * / \
         * 4 5
         */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println("Is subtree: " + isSubtree(root, subroot)); 
    }
}
