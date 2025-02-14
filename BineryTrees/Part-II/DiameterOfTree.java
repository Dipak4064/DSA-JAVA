public class DiameterOfTree {
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

    public static int Diameter(Node root) {//TC : O(n^2)
        //approach 1
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = Diameter(root.left);
        int rightDiameter = Diameter(root.right);
        // int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    public static void main(String[] args) {
        /*         
         *            1 
         *           / \
         *          2   3 
         *         / \ / \ 
         *        4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("Height of the tree: " + Diameter(root));
    }
}
